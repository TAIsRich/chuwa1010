# 01. 单链表解题技巧	

## 双指针技巧

https://labuladong.github.io/algo/2/19/18/

### 合并两个有序链表

##### [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

while 循环每次比较 `p1` 和 `p2` 的大小，把较小的节点接到结果链表上，看如下

![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/1.gif)

这个算法的逻辑类似于拉拉链，`l1, l2` 类似于拉链两侧的锯齿，指针 `p` 就好像拉链的拉索，将两个有序链表合并；或者说这个过程像蛋白酶合成蛋白质，`l1, l2` 就好比两条氨基酸，而指针 `p` 就好像蛋白酶，将氨基酸组合成蛋白质。

**代码中还用到一个链表的算法题中是很常见的「虚拟头结点」技巧，也就是 `dummy` 节点**。你可以试试，如果不使用 `dummy` 虚拟节点，代码会复杂很多，而有了 `dummy` 节点这个占位符，可以避免处理空指针的情况，降低代码的复杂性。

```java
ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // 虚拟头结点
    ListNode dummy = new ListNode(-1), p = dummy;
    ListNode p1 = l1, p2 = l2;
    
    while (p1 != null && p2 != null) {
        // 比较 p1 和 p2 两个指针
        // 将值较小的的节点接到 p 指针
        if (p1.val > p2.val) {
            p.next = p2;
            p2 = p2.next;
        } else {
            p.next = p1;
            p1 = p1.next;
        }
        // p 指针不断前进
        p = p.next;
    }
    
    if (p1 != null) {
        p.next = p1;
    }
    
    if (p2 != null) {
        p.next = p2;
    }
    
    return dummy.next;
}
```



>什么时候需要用虚拟头结点？**当你需要创造一条新链表的时候，可以使用虚拟头结点简化边界情况的处理**。
>
>比如说，让你把两条有序链表合并成一条新的有序链表，是不是要创造一条新链表？再比你想把一条链表分解成两条链表，是不是也在创造新链表？这些情况都可以使用虚拟头结点简化边界情况的处理。

### 单链表的分解

##### [86. Partition List](https://leetcode.com/problems/partition-list/)

在合并两个有序链表时让你合二为一，而这里需要分解让你把原链表一分为二。具体来说，我们可以把原链表分成两个小链表，一个链表中的元素大小都小于 `x`，另一个链表中的元素都大于等于 `x`，最后再把这两条链表接到一起，就得到了题目想要的结果。

```java
ListNode partition(ListNode head, int x) {
    // 存放小于 x 的链表的虚拟头结点
    ListNode dummy1 = new ListNode(-1);
    // 存放大于等于 x 的链表的虚拟头结点
    ListNode dummy2 = new ListNode(-1);
    // p1, p2 指针负责生成结果链表
    ListNode p1 = dummy1, p2 = dummy2;
    // p 负责遍历原链表，类似合并两个有序链表的逻辑
    // 这里是将一个链表分解成两个链表
    ListNode p = head;
    while (p != null) {
        if (p.val >= x) {
            p2.next = p;
            p2 = p2.next;
        } else {
            p1.next = p;
            p1 = p1.next;
        }
        // 断开原链表中的每个节点的 next 指针
        ListNode temp = p.next;
        p.next = null;
        p = temp;
    }
    // 连接两个链表
    p1.next = dummy2.next;

    return dummy1.next;
}
```

### 合并 k 个有序链表

##### [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

并 `k` 个有序链表的逻辑类似合并两个有序链表，难点在于，如何快速得到 `k` 个节点中的最小节点，接到结果链表上？

这里我们就要用到 [优先级队列（二叉堆）](https://labuladong.github.io/algo/2/23/65/) 这种数据结构，把链表节点放入一个最小堆，就可以每次获得 `k` 个节点中的最小节点：

```java
ListNode mergeKLists(ListNode[] lists) {
    if (lists.length == 0) return null;
    // 虚拟头结点
    ListNode dummy = new ListNode(-1);
    ListNode p = dummy;
    // 优先级队列，最小堆
    PriorityQueue<ListNode> pq = new PriorityQueue<>(
        lists.length, (a, b)->(a.val - b.val));
    // 将 k 个链表的头结点加入最小堆
    for (ListNode head : lists) {
        if (head != null)
            pq.add(head);
    }

    while (!pq.isEmpty()) {
        // 获取最小节点，接到结果链表中
        ListNode node = pq.poll();
        p.next = node;
        if (node.next != null) {
            pq.add(node.next);
        }
        // p 指针不断前进
        p = p.next;
    }
    return dummy.next;
}
```

时间复杂度是多少呢？

优先队列 `pq` 中的元素个数最多是 `k`，所以一次 `poll` 或者 `add` 方法的时间复杂度是 `O(logk)`；所有的链表节点都会被加入和弹出 `pq`，**所以算法整体的时间复杂度是 `O(Nlogk)`，其中 `k` 是链表的条数，`N` 是这些链表的节点总数**。

### 单链表的倒数第 k 个节点

##### [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

从前往后寻找单链表的第 `k` 个节点很简单，一个 for 循环遍历过去就找到了，但是如何寻找从后往前数的第 `k` 个节点呢？

那你可能说，假设链表有 `n` 个节点，倒数第 `k` 个节点就是正数第 `n - k + 1` 个节点，不也是一个 for 循环的事儿吗？

是的，但是算法题一般只给你一个 `ListNode` 头结点代表一条单链表，你不能直接得出这条链表的长度 `n`，而需要先遍历一遍链表算出 `n` 的值，然后再遍历链表计算第 `n - k + 1` 个节点。

也就是说，这个解法需要遍历两次链表才能得到出倒数第 `k` 个节点。

那么，我们能不能**只遍历一次链表**，就算出倒数第 `k` 个节点？可以做到的，如果是面试问到这道题，面试官肯定也是希望你给出只需遍历一次链表的解法。

这个解法就比较巧妙了，假设 `k = 2`，思路如下：

首先，我们先让一个指针 `p1` 指向链表的头节点 `head`，然后走 `k` 步：

![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/1.jpeg)

现在的 `p1`，只要再走 `n - k` 步，就能走到链表末尾的空指针了对吧？

趁这个时候，再用一个指针 `p2` 指向链表头节点 `head`：

[![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/2.jpeg)](https://labuladong.github.io/algo/images/链表技巧/2.jpeg)

接下来就很显然了，让 `p1` 和 `p2` 同时向前走，`p1` 走到链表末尾的空指针时前进了 `n - k` 步，`p2` 也从 `head` 开始前进了 `n - k` 步，停留在第 `n - k + 1` 个节点上，即恰好停链表的倒数第 `k` 个节点上：

[![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/3.jpeg)](https://labuladong.github.io/algo/images/链表技巧/3.jpeg)

这样，只遍历了一次链表，就获得了倒数第 `k` 个节点 `p2`。

```java
ListNode findFromEnd(ListNode head, int k) {
    ListNode p1 = head;
    // p1 先走 k 步
    for (int i = 0; i < k; i++) {
        p1 = p1.next;
    }
    ListNode p2 = head;
    // p1 和 p2 同时走 n - k 步
    while (p1 != null) {
        p2 = p2.next;
        p1 = p1.next;
    }
    // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
    return p2;
}
```

如果用 big O 表示法来计算时间复杂度，无论遍历一次链表和遍历两次链表的时间复杂度都是 `O(N)`，但上述这个算法更有技巧性。

leetcode 19, 解法代码

```java
// 主函数
public ListNode removeNthFromEnd(ListNode head, int n) {
    // 虚拟头结点
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
    ListNode x = findFromEnd(dummy, n + 1);
    // 删掉倒数第 n 个节点
    x.next = x.next.next;
    return dummy.next;
}
    
private ListNode findFromEnd(ListNode head, int k) {
    // 代码见上文
}
```

这个逻辑就很简单了，要删除倒数第 `n` 个节点，就得获得倒数第 `n + 1` 个节点的引用，可以用我们实现的 `findFromEnd` 来操作。

不过注意我们又使用了虚拟头结点的技巧，也是为了防止出现空指针的情况，比如说链表总共有 5 个节点，题目就让你删除倒数第 5 个节点，也就是第一个节点，那按照算法逻辑，应该首先找到倒数第 6 个节点。但第一个节点前面已经没有节点了，这就会出错。

但有了我们虚拟节点 `dummy` 的存在，就避免了这个问题，能够对这种情况进行正确的删除。

### 单链表的中点

##### [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

问题的关键也在于我们无法直接得到单链表的长度 `n`，常规方法也是先遍历链表计算 `n`，再遍历一次得到第 `n / 2` 个节点，也就是中间节点。

如果想一次遍历就得到中间节点，也需要耍点小聪明，使用「快慢指针」的技巧：

我们让两个指针 `slow` 和 `fast` 分别指向链表头结点 `head`。

**每当慢指针 `slow` 前进一步，快指针 `fast` 就前进两步，这样，当 `fast` 走到链表末尾时，`slow` 就指向了链表中点**。

```java
ListNode middleNode(ListNode head) {
    // 快慢指针初始化指向 head
    ListNode slow = head, fast = head;
    // 快指针走到末尾时停止
    while (fast != null && fast.next != null) {
        // 慢指针走一步，快指针走两步
        slow = slow.next;
        fast = fast.next.next;
    }
    // 慢指针指向中点
    return slow;
}
```

需要注意的是，如果链表长度为偶数，也就是说中点有两个的时候，我们这个解法返回的节点是靠后的那个节点。

另外，这段代码稍加修改就可以直接用到判断链表成环的算法题上。

### 判断链表是否包含环

判断链表是否包含环属于经典问题了，解决方案也是用快慢指针：

每当慢指针 `slow` 前进一步，快指针 `fast` 就前进两步。

如果 `fast` 最终遇到空指针，说明链表中没有环；如果 `fast` 最终和 `slow` 相遇，那肯定是 `fast` 超过了 `slow` 一圈，说明链表中含有环。

只需要把寻找链表中点的代码稍加修改就行了：

```java
boolean hasCycle(ListNode head) {
    // 快慢指针初始化指向 head
    ListNode slow = head, fast = head;
    // 快指针走到末尾时停止
    while (fast != null && fast.next != null) {
        // 慢指针走一步，快指针走两步
        slow = slow.next;
        fast = fast.next.next;
        // 快慢指针相遇，说明含有环
        if (slow == fast) {
            return true;
        }
    }
    // 不包含环
    return false;
}
```

当然，这个问题还有进阶版：如果链表中含有环，如何计算这个环的起点？

这里简单提一下解法：

```java
ListNode detectCycle(ListNode head) {
    ListNode fast, slow;
    fast = slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) break;
    }
    // 上面的代码类似 hasCycle 函数
    if (fast == null || fast.next == null) {
        // fast 遇到空指针说明没有环
        return null;
    }
    // 重新指向头结点
    slow = head;
    // 快慢指针同步前进，相交点就是环起点
    while (slow != fast) {
        fast = fast.next;
        slow = slow.next;
    }
    return slow;
}
```

可以看到，当快慢指针相遇时，让其中任一个指针指向头节点，然后让它俩以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。

为什么要这样呢？这里简单说一下其中的原理。

我们假设快慢指针相遇时，慢指针 `slow` 走了 `k` 步，那么快指针 `fast` 一定走了 `2k` 步：

[![img](https://labuladong.github.io/algo/images/%e5%8f%8c%e6%8c%87%e9%92%88/3.jpeg)](https://labuladong.github.io/algo/images/双指针/3.jpeg)

`fast` 一定比 `slow` 多走了 `k` 步，这多走的 `k` 步其实就是 `fast` 指针在环里转圈圈，所以 `k` 的值就是环长度的「整数倍」。

假设相遇点距环的起点的距离为 `m`，那么结合上图的 `slow` 指针，环的起点距头结点 `head` 的距离为 `k - m`，也就是说如果从 `head` 前进 `k - m` 步就能到达环起点。

巧的是，如果从相遇点继续前进 `k - m` 步，也恰好到达环起点。因为结合上图的 `fast` 指针，从相遇点开始走k步可以转回到相遇点，那走 `k - m` 步肯定就走到环起点了：

[![img](https://labuladong.github.io/algo/images/%e5%8f%8c%e6%8c%87%e9%92%88/2.jpeg)](https://labuladong.github.io/algo/images/双指针/2.jpeg)

所以，只要我们把快慢指针中的任一个重新指向 `head`，然后两个指针同速前进，`k - m` 步后一定会相遇，相遇之处就是环的起点了。

### 两个链表是否相交

##### [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

给你输入两个链表的头结点 `headA` 和 `headB`，这两个链表可能存在相交。

如果相交，你的算法应该返回相交的那个节点；如果没相交，则返回 null。

比如题目给我们举的例子，如果输入的两个链表如下图：

[![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/4.png)](https://labuladong.github.io/algo/images/链表技巧/4.png)

那么我们的算法应该返回 `c1` 这个节点。

这个题直接的想法可能是用 `HashSet` 记录一个链表的所有节点，然后和另一条链表对比，但这就需要额外的空间。

如果不用额外的空间，只使用两个指针，你如何做呢？

难点在于，由于两条链表的长度可能不同，两条链表之间的节点无法对应：

[![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/5.jpeg)](https://labuladong.github.io/algo/images/链表技巧/5.jpeg)

如果用两个指针 `p1` 和 `p2` 分别在两条链表上前进，并不能**同时**走到公共节点，也就无法得到相交节点 `c1`。

**解决这个问题的关键是，通过某些方式，让 `p1` 和 `p2` 能够同时到达相交节点 `c1`**。

所以，我们可以让 `p1` 遍历完链表 `A` 之后开始遍历链表 `B`，让 `p2` 遍历完链表 `B` 之后开始遍历链表 `A`，这样相当于「逻辑上」两条链表接在了一起。

如果这样进行拼接，就可以让 `p1` 和 `p2` 同时进入公共部分，也就是同时到达相交节点 `c1`：

[![img](https://labuladong.github.io/algo/images/%e9%93%be%e8%a1%a8%e6%8a%80%e5%b7%a7/6.jpeg)](https://labuladong.github.io/algo/images/链表技巧/6.jpeg)

那你可能会问，如果说两个链表没有相交点，是否能够正确的返回 null 呢？

这个逻辑可以覆盖这种情况的，相当于 `c1` 节点是 null 空指针嘛，可以正确返回 null。

按照这个思路，可以写出如下代码：

```java
ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // p1 指向 A 链表头结点，p2 指向 B 链表头结点
    ListNode p1 = headA, p2 = headB;
    while (p1 != p2) {
        // p1 走一步，如果走到 A 链表末尾，转到 B 链表
        if (p1 == null) p1 = headB;
        else            p1 = p1.next;
        // p2 走一步，如果走到 B 链表末尾，转到 A 链表
        if (p2 == null) p2 = headA;
        else            p2 = p2.next;
    }
    return p1;
}
```

这样，这道题就解决了，空间复杂度为 `O(1)`，时间复杂度为 `O(N)`。



补充内容查看原文章最后。提供两种思路



# 02. 数组双指针解题技巧	

https://labuladong.github.io/algo/2/20/23/

### 快慢指针技巧

##### [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

简单解释一下什么是原地修改：

如果不是原地修改的话，我们直接 new 一个 `int[]` 数组，把去重之后的元素放进这个新数组中，然后返回这个新数组即可。

但是现在题目让你原地删除，不允许 new 新数组，只能在原数组上操作，然后返回一个长度，这样就可以通过返回的长度和原始数组得到我们去重后的元素有哪些了。

由于数组已经排序，所以重复的元素一定连在一起，找出它们并不难。但如果毎找到一个重复元素就立即原地删除它，由于数组中删除元素涉及数据搬移，整个时间复杂度是会达到 `O(N^2)`。

高效解决这道题就要用到快慢指针技巧：

我们让慢指针 `slow` 走在后面，快指针 `fast` 走在前面探路，找到一个不重复的元素就赋值给 `slow` 并让 `slow` 前进一步。

这样，就保证了 `nums[0..slow]` 都是无重复的元素，当 `fast` 指针遍历完整个数组 `nums` 后，`nums[0..slow]` 就是整个数组去重之后的结果。

看代码：

```java
int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
    int slow = 0, fast = 0;
    while (fast < nums.length) {
        if (nums[fast] != nums[slow]) {
            slow++;
            // 维护 nums[0..slow] 无重复
            nums[slow] = nums[fast];
        }
        fast++;
    }
    // 数组长度为索引 + 1
    return slow + 1;
}
```

算法执行的过程如下 GIF 图：

[![img](https://labuladong.github.io/algo/images/%e6%95%b0%e7%bb%84%e5%8e%bb%e9%87%8d/1.gif)](https://labuladong.github.io/algo/images/数组去重/1.gif)

再简单扩展一下，看看力扣第 83 题「 [删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/)」，如果给你一个有序的单链表，如何去重呢？

其实和数组去重是一模一样的，唯一的区别是把数组赋值操作变成操作指针而已，你对照着之前的代码来看：

```java
ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;
    ListNode slow = head, fast = head;
    while (fast != null) {
        if (fast.val != slow.val) {
            // nums[slow] = nums[fast];
            slow.next = fast;
            // slow++;
            slow = slow.next;
        }
        // fast++
        fast = fast.next;
    }
    // 断开与后面重复元素的连接
    slow.next = null;
    return head;
}
```

算法执行的过程请看下面这个 GIF：

[![img](https://labuladong.github.io/algo/images/%e6%95%b0%e7%bb%84%e5%8e%bb%e9%87%8d/2.gif)](https://labuladong.github.io/algo/images/数组去重/2.gif)

这里可能有读者会问，链表中那些重复的元素并没有被删掉，就让这些节点在链表上挂着，合适吗？

这就要探讨不同语言的特性了，像 Java/Python 这类带有垃圾回收的语言，可以帮我们自动找到并回收这些「悬空」的链表节点的内存，而像 C++ 这类语言没有自动垃圾回收的机制，确实需要我们编写代码时手动释放掉这些节点的内存。

不过话说回来，就算法思维的培养来说，我们只需要知道这种快慢指针技巧即可。



**除了让你在有序数组/链表中去重，题目还可能让你对数组中的某些元素进行「原地删除」**。

##### [27. Remove Element](https://leetcode.com/problems/remove-element/)

题目要求我们把 `nums` 中所有值为 `val` 的元素原地删除，依然需要使用快慢指针技巧：

如果 `fast` 遇到值为 `val` 的元素，则直接跳过，否则就赋值给 `slow` 指针，并让 `slow` 前进一步。

这和前面说到的数组去重问题解法思路是完全一样的，就不画 GIF 了，直接看代码：

```java
int removeElement(int[] nums, int val) {
    int fast = 0, slow = 0;
    while (fast < nums.length) {
        if (nums[fast] != val) {
            nums[slow] = nums[fast];
            slow++;
        }
        fast++;
    }
    return slow;
}
```

注意这里和有序数组去重的解法有一个细节差异，我们这里是先给 `nums[slow]` 赋值然后再给 `slow++`，这样可以保证 `nums[0..slow-1]` 是不包含值为 `val` 的元素的，最后的结果数组长度就是 `slow`。

实现了这个 `removeElement` 函数，接下来看看力扣第 283 题「 [移动零](https://leetcode.cn/problems/move-zeroes/)」：

给你输入一个数组 `nums`，请你**原地修改**，将数组中的所有值为 0 的元素移到数组末尾，函数签名如下：

```java
void moveZeroes(int[] nums);
```

比如说给你输入 `nums = [0,1,4,0,2]`，你的算法没有返回值，但是会把 `nums` 数组原地修改成 `[1,4,2,0,0]`。

结合之前说到的几个题目，你是否有已经有了答案呢？

题目让我们将所有 0 移到最后，其实就相当于移除 `nums` 中的所有 0，然后再把后面的元素都赋值为 0 即可。

所以我们可以复用上一题的 `removeElement` 函数：

```java
void moveZeroes(int[] nums) {
    // 去除 nums 中的所有 0，返回不含 0 的数组长度
    int p = removeElement(nums, 0);
    // 将 nums[p..] 的元素赋值为 0
    for (; p < nums.length; p++) {
        nums[p] = 0;
    }
}

// 见上文代码实现
int removeElement(int[] nums, int val);
```

到这里，原地修改数组的这些题目就已经差不多了。数组中另一大类快慢指针的题目就是「滑动窗口算法」。

我在另一篇文章 [滑动窗口算法核心框架详解](https://labuladong.github.io/algo/2/20/27/) 给出了滑动窗口的代码框架：

```cpp
/* 滑动窗口算法框架 */
void slidingWindow(string s, string t) {
    unordered_map<char, int> need, window;
    for (char c : t) need[c]++;
    
    int left = 0, right = 0;
    int valid = 0; 
    while (right < s.size()) {
        char c = s[right];
        // 右移（增大）窗口
        right++;
        // 进行窗口内数据的一系列更新

        while (window needs shrink) {
            char d = s[left];
            // 左移（缩小）窗口
            left++;
            // 进行窗口内数据的一系列更新
        }
    }
}
```

具体的题目本文就不重复了，这里只强调滑动窗口算法的快慢指针特性：

`left` 指针在后，`right` 指针在前，两个指针中间的部分就是「窗口」，算法通过扩大和缩小「窗口」来解决某些问题。

### 左右指针

#### **1、二分查找**

我在另一篇文章 [二分查找框架详解](https://labuladong.github.io/algo/2/20/29/) 中有详细探讨二分搜索代码的细节问题，这里只写最简单的二分算法，旨在突出它的双指针特性：

```java
int binarySearch(int[] nums, int target) {
    // 一左一右两个指针相向而行
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = (right + left) / 2;
        if(nums[mid] == target)
            return mid; 
        else if (nums[mid] < target)
            left = mid + 1; 
        else if (nums[mid] > target)
            right = mid - 1;
    }
    return -1;
}
```

#### **2、两数之和**

##### [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

只要数组有序，就应该想到双指针技巧。这道题的解法有点类似二分查找，通过调节 `left` 和 `right` 就可以调整 `sum` 的大小：

```java
int[] twoSum(int[] nums, int target) {
    // 一左一右两个指针相向而行
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            // 题目要求的索引是从 1 开始的
            return new int[]{left + 1, right + 1};
        } else if (sum < target) {
            left++; // 让 sum 大一点
        } else if (sum > target) {
            right--; // 让 sum 小一点
        }
    }
    return new int[]{-1, -1};
}
```

我在另一篇文章 [一个函数秒杀所有 nSum 问题](https://labuladong.github.io/algo/1/15/) 中也运用类似的左右指针技巧给出了 `nSum` 问题的一种通用思路，这里就不做赘述了。

#### **3、反转数组**

一般编程语言都会提供 `reverse` 函数，其实这个函数的原理非常简单，力扣第 344 题「 [反转字符串](https://leetcode.cn/problems/reverse-string/)」就是类似的需求，让你反转一个 `char[]` 类型的字符数组，我们直接看代码吧：

```java
void reverseString(char[] s) {
    // 一左一右两个指针相向而行
    int left = 0, right = s.length - 1;
    while (left < right) {
        // 交换 s[left] 和 s[right]
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
}
```

#### **4、回文串判断**

首先明确一下，回文串就是正着读和反着读都一样的字符串。

比如说字符串 `aba` 和 `abba` 都是回文串，因为它们对称，反过来还是和本身一样；反之，字符串 `abac` 就不是回文串。

现在你应该能感觉到回文串问题和左右指针肯定有密切的联系，比如让你判断一个字符串是不是回文串，你可以写出下面这段代码：

```java
boolean isPalindrome(String s) {
    // 一左一右两个指针相向而行
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

##### [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

找回文串的难点在于，回文串的的长度可能是奇数也可能是偶数，解决该问题的核心是**从中心向两端扩散的双指针技巧**。

如果回文串的长度为奇数，则它有一个中心字符；如果回文串的长度为偶数，则可以认为它有两个中心字符。所以我们可以先实现这样一个函数：

```java
// 在 s 中寻找以 s[l] 和 s[r] 为中心的最长回文串
String palindrome(String s, int l, int r) {
    // 防止索引越界
    while (l >= 0 && r < s.length()
            && s.charAt(l) == s.charAt(r)) {
        // 双指针，向两边展开
        l--; r++;
    }
    // 返回以 s[l] 和 s[r] 为中心的最长回文串
    return s.substring(l + 1, r);
}
```

这样，如果输入相同的 `l` 和 `r`，就相当于寻找长度为奇数的回文串，如果输入相邻的 `l` 和 `r`，则相当于寻找长度为偶数的回文串。

那么回到最长回文串的问题，解法的大致思路就是：

```python
for 0 <= i < len(s):
    找到以 s[i] 为中心的回文串
    找到以 s[i] 和 s[i+1] 为中心的回文串
    更新答案
```

翻译成代码，就可以解决最长回文子串这个问题：

```java
String longestPalindrome(String s) {
    String res = "";
    for (int i = 0; i < s.length(); i++) {
        // 以 s[i] 为中心的最长回文子串
        String s1 = palindrome(s, i, i);
        // 以 s[i] 和 s[i+1] 为中心的最长回文子串
        String s2 = palindrome(s, i, i + 1);
        // res = longest(res, s1, s2)
        res = res.length() > s1.length() ? res : s1;
        res = res.length() > s2.length() ? res : s2;
    }
    return res;
}
```

你应该能发现最长回文子串使用的左右指针和之前题目的左右指针有一些不同：之前的左右指针都是从两端向中间相向而行，而回文子串问题则是让左右指针从中心向两端扩展。不过这种情况也就回文串这类问题会遇到，所以我也把它归为左右指针了。



# 03. 前缀和数组技巧	

https://labuladong.github.io/algo/2/20/24/

### 一维数组中的前缀和

##### [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

`sumRange` 函数需要计算并返回一个索引区间之内的元素和，没学过前缀和的人可能写出如下代码：

```java
class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            res += nums[i];
        }
        return res;
    }
}
```

这样，可以达到效果，但是效率很差，因为 `sumRange` 方法会被频繁调用，而它的时间复杂度是 `O(N)`，其中 `N` 代表 `nums` 数组的长度。

这道题的最优解法是使用前缀和技巧，将 `sumRange` 函数的时间复杂度降为 `O(1)`，说白了就是不要在 `sumRange` 里面用 for 循环，咋整？

直接看代码实现：

```java
class NumArray {
    // 前缀和数组
    private int[] preSum;

    /* 输入一个数组，构造前缀和 */
    public NumArray(int[] nums) {
        // preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
        // 计算 nums 的累加和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }
    
    /* 查询闭区间 [left, right] 的累加和 */
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}
```

核心思路是我们 new 一个新的数组 `preSum` 出来，`preSum[i]` 记录 `nums[0..i-1]` 的累加和，看图 10 = 3 + 5 + 2：

[![img](https://labuladong.github.io/algo/images/%e5%b7%ae%e5%88%86%e6%95%b0%e7%bb%84/1.jpeg)](https://labuladong.github.io/algo/images/差分数组/1.jpeg)

看这个 `preSum` 数组，如果我想求索引区间 `[1, 4]` 内的所有元素之和，就可以通过 `preSum[5] - preSum[1]` 得出。

这样，`sumRange` 函数仅仅需要做一次减法运算，避免了每次进行 for 循环调用，最坏时间复杂度为常数 `O(1)`。

这个技巧在生活中运用也挺广泛的，比方说，你们班上有若干同学，每个同学有一个期末考试的成绩（满分 100 分），那么请你实现一个 API，输入任意一个分数段，返回有多少同学的成绩在这个分数段内。

那么，你可以先通过计数排序的方式计算每个分数具体有多少个同学，然后利用前缀和技巧来实现分数段查询的 API：

```java
int[] scores; // 存储着所有同学的分数
// 试卷满分 100 分
int[] count = new int[100 + 1]
// 记录每个分数有几个同学
for (int score : scores)
    count[score]++
// 构造前缀和
for (int i = 1; i < count.length; i++)
    count[i] = count[i] + count[i-1];

// 利用 count 这个前缀和数组进行分数段查询
```

接下来，我们看一看前缀和思路在二维数组中如何运用。

### 二维矩阵中的前缀和

##### [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)

`matrix` 如下图：

[![img](https://labuladong.github.io/algo/images/%e5%89%8d%e7%bc%80%e5%92%8c/4.png)](https://labuladong.github.io/algo/images/前缀和/4.png)

按照题目要求，矩阵左上角为坐标原点 `(0, 0)`，那么 `sumRegion([2,1,4,3])` 就是图中红色的子矩阵，你需要返回该子矩阵的元素和 8。

当然，你可以用一个嵌套 for 循环去遍历这个矩阵，但这样的话 `sumRegion` 函数的时间复杂度就高了，你算法的格局就低了。

注意任意子矩阵的元素和可以转化成它周边几个大矩阵的元素和的运算：

[![img](https://labuladong.github.io/algo/images/%e5%89%8d%e7%bc%80%e5%92%8c/5.jpeg)](https://labuladong.github.io/algo/images/前缀和/5.jpeg)

而这四个大矩阵有一个共同的特点，就是左上角都是 `(0, 0)` 原点。

那么做这道题更好的思路和一维数组中的前缀和是非常类似的，我们可以维护一个二维 `preSum` 数组，专门记录以原点为顶点的矩阵的元素之和，就可以用几次加减运算算出任何一个子矩阵的元素和：

```java
class NumMatrix {
    // 定义：preSum[i][j] 记录 matrix 中子矩阵 [0, 0, i-1, j-1] 的元素和
    private int[][] preSum;
    
    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 0 || n == 0) return;
        // 构造前缀和矩阵
        preSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 计算每个矩阵 [0, 0, i, j] 的元素和
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] + matrix[i - 1][j - 1] - preSum[i-1][j-1];
            }
        }
    }
    
    // 计算子矩阵 [x1, y1, x2, y2] 的元素和
    public int sumRegion(int x1, int y1, int x2, int y2) {
        // 目标矩阵之和由四个相邻矩阵运算获得
        return preSum[x2+1][y2+1] - preSum[x1][y2+1] - preSum[x2+1][y1] + preSum[x1][y1];
    }
}
```

这样，`sumRegion` 函数的时间复杂度也用前缀和技巧优化到了 O(1)，这是典型的「空间换时间」思路。

前缀和技巧就讲到这里，应该说这个算法技巧是会者不难难者不会，实际运用中还是要多培养自己的思维灵活性，做到一眼看出题目是一个前缀和问题。

除了本文举例的基本用法，前缀和数组经常和其他数据结构或算法技巧相结合，我会在 [前缀和技巧高频习题](https://appktavsiei5995.pc.xiaoe-tech.com/detail/i_627cd61de4b0cedf38b0f3a0/1) 中举例讲解。



# 04. 差分数组技巧	

https://labuladong.github.io/algo/2/20/25/

### 简介

**前缀和主要适用的场景是原始数组不会被修改的情况下，频繁查询某个区间的累加和**。

没看过前文没关系，这里简单介绍一下前缀和，核心代码就是下面这段：

```java
class PrefixSum {
    // 前缀和数组
    private int[] prefix;
    
    /* 输入一个数组，构造前缀和 */
    public PrefixSum(int[] nums) {
        prefix = new int[nums.length + 1];
        // 计算 nums 的累加和
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
    }

    /* 查询闭区间 [i, j] 的累加和 */
    public int query(int i, int j) {
        return prefix[j + 1] - prefix[i];
    }
}
```

[![img](https://labuladong.github.io/algo/images/%e5%b7%ae%e5%88%86%e6%95%b0%e7%bb%84/1.jpeg)](https://labuladong.github.io/algo/images/差分数组/1.jpeg)

`prefix[i]` 就代表着 `nums[0..i-1]` 所有元素的累加和，如果我们想求区间 `nums[i..j]` 的累加和，只要计算 `prefix[j+1] - prefix[i]` 即可，而不需要遍历整个区间求和。

本文讲一个和前缀和思想非常类似的算法技巧「差分数组」，**差分数组的主要适用场景是频繁对原始数组的某个区间的元素进行增减**。

比如说，我给你输入一个数组 `nums`，然后又要求给区间 `nums[2..6]` 全部加 1，再给 `nums[3..9]` 全部减 3，再给 `nums[0..4]` 全部加 2，再给…

一通操作猛如虎，然后问你，最后 `nums` 数组的值是什么？

常规的思路很容易，你让我给区间 `nums[i..j]` 加上 `val`，那我就一个 for 循环给它们都加上呗，还能咋样？这种思路的时间复杂度是 O(N)，由于这个场景下对 `nums` 的修改非常频繁，所以效率会很低下。

这里就需要差分数组的技巧，类似前缀和技巧构造的 `prefix` 数组，我们先对 `nums` 数组构造一个 `diff` 差分数组，**`diff[i]` 就是 `nums[i]` 和 `nums[i-1]` 之差**：

```java
int[] diff = new int[nums.length];
// 构造差分数组
diff[0] = nums[0];
for (int i = 1; i < nums.length; i++) {
    diff[i] = nums[i] - nums[i - 1];
}
```

[![img](https://labuladong.github.io/algo/images/%e5%b7%ae%e5%88%86%e6%95%b0%e7%bb%84/2.jpeg)](https://labuladong.github.io/algo/images/差分数组/2.jpeg)

通过这个 `diff` 差分数组是可以反推出原始数组 `nums` 的，代码逻辑如下：

```java
int[] res = new int[diff.length];
// 根据差分数组构造结果数组
res[0] = diff[0];
for (int i = 1; i < diff.length; i++) {
    res[i] = res[i - 1] + diff[i];
}
```

**这样构造差分数组 `diff`，就可以快速进行区间增减的操作**，如果你想对区间 `nums[i..j]` 的元素全部加 3，那么只需要让 `diff[i] += 3`，然后再让 `diff[j+1] -= 3` 即可：

[![img](https://labuladong.github.io/algo/images/%e5%b7%ae%e5%88%86%e6%95%b0%e7%bb%84/3.jpeg)](https://labuladong.github.io/algo/images/差分数组/3.jpeg)

**原理很简单，回想 `diff` 数组反推 `nums` 数组的过程，`diff[i] += 3` 意味着给 `nums[i..]` 所有的元素都加了 3，然后 `diff[j+1] -= 3` 又意味着对于 `nums[j+1..]` 所有元素再减 3，那综合起来，是不是就是对 `nums[i..j]` 中的所有元素都加 3 了**？

只要花费 O(1) 的时间修改 `diff` 数组，就相当于给 `nums` 的整个区间做了修改。多次修改 `diff`，然后通过 `diff` 数组反推，即可得到 `nums` 修改后的结果。

现在我们把差分数组抽象成一个类，包含 `increment` 方法和 `result` 方法：

```java
// 差分数组工具类
class Difference {
    // 差分数组
    private int[] diff;
    
    /* 输入一个初始数组，区间操作将在这个数组上进行 */
    public Difference(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        // 根据初始数组构造差分数组
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    /* 给闭区间 [i, j] 增加 val（可以是负数）*/
    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    /* 返回结果数组 */
    public int[] result() {
        int[] res = new int[diff.length];
        // 根据差分数组构造结果数组
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
```

这里注意一下 `increment` 方法中的 if 语句：

```java
public void increment(int i, int j, int val) {
    diff[i] += val;
    if (j + 1 < diff.length) {
        diff[j + 1] -= val;
    }
}
```

当 `j+1 >= diff.length` 时，说明是对 `nums[i]` 及以后的整个数组都进行修改，那么就不需要再给 `diff` 数组减 `val` 了。

### 算法实践

##### [370. Range Addition](https://leetcode.com/problems/range-addition/)

那么我们直接复用刚才实现的 `Difference` 类就能把这道题解决掉：

```java
int[] getModifiedArray(int length, int[][] updates) {
    // nums 初始化为全 0
    int[] nums = new int[length];
    // 构造差分解法
    Difference df = new Difference(nums);
    
    for (int[] update : updates) {
        int i = update[0];
        int j = update[1];
        int val = update[2];
        df.increment(i, j, val);
    }
    
    return df.result();
}
```

当然，实际的算法题可能需要我们对题目进行联想和抽象，不会这么直接地让你看出来要用差分数组技巧，这里看一下

##### [1109. Corporate Flight Bookings](https://leetcode.com/problems/corporate-flight-bookings/)

这个题目就在那绕弯弯，其实它就是个差分数组的题，我给你翻译一下：

给你输入一个长度为 `n` 的数组 `nums`，其中所有元素都是 0。再给你输入一个 `bookings`，里面是若干三元组 `(i, j, k)`，每个三元组的含义就是要求你给 `nums` 数组的闭区间 `[i-1,j-1]` 中所有元素都加上 `k`。请你返回最后的 `nums` 数组是多少？

> PS：因为题目说的 `n` 是从 1 开始计数的，而数组索引从 0 开始，所以对于输入的三元组 `(i, j, k)`，数组区间应该对应 `[i-1,j-1]`。

这么一看，不就是一道标准的差分数组题嘛？我们可以直接复用刚才写的类：

```java
int[] corpFlightBookings(int[][] bookings, int n) {
    // nums 初始化为全 0
    int[] nums = new int[n];
    // 构造差分解法
    Difference df = new Difference(nums);

    for (int[] booking : bookings) {
        // 注意转成数组索引要减一哦
        int i = booking[0] - 1;
        int j = booking[1] - 1;
        int val = booking[2];
        // 对区间 nums[i..j] 增加 val
        df.increment(i, j, val);
    }
    // 返回最终的结果数组
    return df.result();
}
```

这道题就解决了。

还有一道很类似的题目是力扣第 1094 题「 [拼车](https://leetcode.cn/problems/car-pooling/)」，我简单描述下题目：

你是一个开公交车的司机，公交车的最大载客量为 `capacity`，沿途要经过若干车站，给你一份乘客行程表 `int[][] trips`，其中 `trips[i] = [num, start, end]` 代表着有 `num` 个旅客要从站点 `start` 上车，到站点 `end` 下车，请你计算是否能够一次把所有旅客运送完毕（不能超过最大载客量 `capacity`）。

函数签名如下：

```java
boolean carPooling(int[][] trips, int capacity);
```

比如输入：

```shell
trips = [[2,1,5],[3,3,7]], capacity = 4
```

这就不能一次运完，因为 `trips[1]` 最多只能上 2 人，否则车就会超载。

相信你已经能够联想到差分数组技巧了：**`trips[i]` 代表着一组区间操作，旅客的上车和下车就相当于数组的区间加减；只要结果数组中的元素都小于 `capacity`，就说明可以不超载运输所有旅客**。

但问题是，差分数组的长度（车站的个数）应该是多少呢？题目没有直接给，但给出了数据取值范围：

```java
0 <= trips[i][1] < trips[i][2] <= 1000
```

车站编号从 0 开始，最多到 1000，也就是最多有 1001 个车站，那么我们的差分数组长度可以直接设置为 1001，这样索引刚好能够涵盖所有车站的编号：

```java
boolean carPooling(int[][] trips, int capacity) {
    // 最多有 1001 个车站
    int[] nums = new int[1001];
    // 构造差分解法
    Difference df = new Difference(nums);
    
    for (int[] trip : trips) {
        // 乘客数量
        int val = trip[0];
        // 第 trip[1] 站乘客上车
        int i = trip[1];
        // 第 trip[2] 站乘客已经下车，
        // 即乘客在车上的区间是 [trip[1], trip[2] - 1]
        int j = trip[2] - 1;
        // 进行区间操作
        df.increment(i, j, val);
    }
    
    int[] res = df.result();
    
    // 客车自始至终都不应该超载
    for (int i = 0; i < res.length; i++) {
        if (capacity < res[i]) {
            return false;
        }
    }
    return true;
}
```

至此，这道题也解决了。

最后，差分数组和前缀和数组都是比较常见且巧妙的算法技巧，分别适用不同的场景，而且是会者不难，难者不会。



# 05. 二维数组花式遍历技巧	

https://labuladong.github.io/algo/2/20/26/

### 顺/逆时针旋转矩阵

##### [48. Rotate Image](https://leetcode.com/problems/rotate-image/)

题目很好理解，就是让你将一个二维矩阵顺时针旋转 90 度，**难点在于要「原地」修改**，函数签名如下：

```java
void rotate(int[][] matrix)
```

如何「原地」旋转二维矩阵？稍想一下，感觉操作起来非常复杂，可能要设置巧妙的算法机制来「一圈一圈」旋转矩阵：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/1.png)](https://labuladong.github.io/algo/images/花式遍历/1.png)

**但实际上，这道题不能走寻常路**，在讲巧妙解法之前，我们先看另一道谷歌曾经考过的算法题热热身：

给你一个包含若干单词和空格的字符串 `s`，请你写一个算法，**原地**反转所有单词的顺序。

比如说，给你输入这样一个字符串：

```shell
s = "hello world labuladong"
```

你的算法需要**原地**反转这个字符串中的单词顺序：

```shell
s = "labuladong world hello"
```

常规的方式是把 `s` 按空格 `split` 成若干单词，然后 `reverse` 这些单词的顺序，最后把这些单词 `join` 成句子。但这种方式使用了额外的空间，并不是「原地反转」单词。

**正确的做法是，先将整个字符串 `s` 反转**：

```shell
s = "gnodalubal dlrow olleh"
```

**然后将每个单词分别反转**：

```shell
s = "labuladong world hello"
```

这样，就实现了原地反转所有单词顺序的目的。力扣第 151 题「 [颠倒字符串中的单词](https://leetcode.cn/problems/reverse-words-in-a-string/)」就是类似的问题，你可以顺便去做一下。

我讲这道题的目的是什么呢？

**旨在说明，有时候咱们拍脑袋的常规思维，在计算机看来可能并不是最优雅的；但是计算机觉得最优雅的思维，对咱们来说却不那么直观**。也许这就是算法的魅力所在吧。

回到之前说的顺时针旋转二维矩阵的问题，常规的思路就是去寻找原始坐标和旋转后坐标的映射规律，但我们是否可以让思维跳跃跳跃，尝试把矩阵进行反转、镜像对称等操作，可能会出现新的突破口。

**我们可以先将 `n x n` 矩阵 `matrix` 按照左上到右下的对角线进行镜像对称**：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/2.jpeg)](https://labuladong.github.io/algo/images/花式遍历/2.jpeg)

**然后再对矩阵的每一行进行反转**：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/3.jpeg)](https://labuladong.github.io/algo/images/花式遍历/3.jpeg)

**发现结果就是 `matrix` 顺时针旋转 90 度的结果**：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/4.jpeg)](https://labuladong.github.io/algo/images/花式遍历/4.jpeg)

将上述思路翻译成代码，即可解决本题：

```java
// 将二维矩阵原地顺时针旋转 90 度
public void rotate(int[][] matrix) {
    int n = matrix.length;
    // 先沿对角线镜像对称二维矩阵
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            // swap(matrix[i][j], matrix[j][i]);
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    // 然后反转二维矩阵的每一行
    for (int[] row : matrix) {
        reverse(row);
    }
}

// 反转一维数组
void reverse(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (j > i) {
        // swap(arr[i], arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
```

肯定有读者会问，如果没有做过这道题，怎么可能想到这种思路呢？

仔细想想，旋转二维矩阵的难点在于将「行」变成「列」，将「列」变成「行」，而只有按照对角线的对称操作是可以轻松完成这一点的，对称操作之后就很容易发现规律了。

**既然说道这里，我们可以发散一下，如何将矩阵逆时针旋转 90 度呢**？

思路是类似的，只要通过另一条对角线镜像对称矩阵，然后再反转每一行，就得到了逆时针旋转矩阵的结果：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/5.jpeg)](https://labuladong.github.io/algo/images/花式遍历/5.jpeg)

翻译成代码如下：

```java
// 将二维矩阵原地逆时针旋转 90 度
void rotate2(int[][] matrix) {
    int n = matrix.length;
    // 沿左下到右上的对角线镜像对称二维矩阵
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            // swap(matrix[i][j], matrix[n-j-1][n-i-1])
            int temp = matrix[i][j];
            matrix[i][j] = matrix[n - j - 1][n - i - 1];
            matrix[n - j - 1][n - i - 1] = temp;
        }
    }
    // 然后反转二维矩阵的每一行
    for (int[] row : matrix) {
        reverse(row);
    }
}

void reverse(int[] arr) { /* 见上文 */}
```

至此，旋转矩阵的问题就解决了。

### 矩阵的螺旋遍历

我的公众号动态规划系列文章经常需要遍历二维 `dp` 数组，但难点在于状态转移方程而不是数组的遍历，顶多就是倒序遍历。

##### [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

**解题的核心思路是按照右、下、左、上的顺序遍历数组，并使用四个变量圈定未遍历元素的边界**：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/6.png)](https://labuladong.github.io/algo/images/花式遍历/6.png)

随着螺旋遍历，相应的边界会收缩，直到螺旋遍历完整个数组：

[![img](https://labuladong.github.io/algo/images/%e8%8a%b1%e5%bc%8f%e9%81%8d%e5%8e%86/7.png)](https://labuladong.github.io/algo/images/花式遍历/7.png)

只要有了这个思路，翻译出代码就很容易了：

```java
List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    int upper_bound = 0, lower_bound = m - 1;
    int left_bound = 0, right_bound = n - 1;
    List<Integer> res = new LinkedList<>();
    // res.size() == m * n 则遍历完整个数组
    while (res.size() < m * n) {
        if (upper_bound <= lower_bound) {
            // 在顶部从左向右遍历
            for (int j = left_bound; j <= right_bound; j++) {
                res.add(matrix[upper_bound][j]);
            }
            // 上边界下移
            upper_bound++;
        }
        
        if (left_bound <= right_bound) {
            // 在右侧从上向下遍历
            for (int i = upper_bound; i <= lower_bound; i++) {
                res.add(matrix[i][right_bound]);
            }
            // 右边界左移
            right_bound--;
        }
        
        if (upper_bound <= lower_bound) {
            // 在底部从右向左遍历
            for (int j = right_bound; j >= left_bound; j--) {
                res.add(matrix[lower_bound][j]);
            }
            // 下边界上移
            lower_bound--;
        }
        
        if (left_bound <= right_bound) {
            // 在左侧从下向上遍历
            for (int i = lower_bound; i >= upper_bound; i--) {
                res.add(matrix[i][left_bound]);
            }
            // 左边界右移
            left_bound++;
        }
    }
    return res;
}
```

##### [59. Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)

有了上面的铺垫，稍微改一下代码即可完成这道题：

```java
int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int upper_bound = 0, lower_bound = n - 1;
    int left_bound = 0, right_bound = n - 1;
    // 需要填入矩阵的数字
    int num = 1;
    
    while (num <= n * n) {
        if (upper_bound <= lower_bound) {
            // 在顶部从左向右遍历
            for (int j = left_bound; j <= right_bound; j++) {
                matrix[upper_bound][j] = num++;
            }
            // 上边界下移
            upper_bound++;
        }
        
        if (left_bound <= right_bound) {
            // 在右侧从上向下遍历
            for (int i = upper_bound; i <= lower_bound; i++) {
                matrix[i][right_bound] = num++;
            }
            // 右边界左移
            right_bound--;
        }
        
        if (upper_bound <= lower_bound) {
            // 在底部从右向左遍历
            for (int j = right_bound; j >= left_bound; j--) {
                matrix[lower_bound][j] = num++;
            }
            // 下边界上移
            lower_bound--;
        }
        
        if (left_bound <= right_bound) {
            // 在左侧从下向上遍历
            for (int i = lower_bound; i >= upper_bound; i--) {
                matrix[i][left_bound] = num++;
            }
            // 左边界右移
            left_bound++;
        }
    }
    return matrix;
}
```

至此，两道螺旋矩阵的题目也解决了。

以上就是遍历二维数组的一些技巧，其他数组技巧可参见之前的文章 [前缀和数组](https://labuladong.github.io/algo/2/20/24/)， [差分数组](https://labuladong.github.io/algo/2/20/25/)， [数组双指针算法集合](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)，链表相关技巧可参见 [单链表六大算法技巧汇总](https://labuladong.github.io/algo/2/19/18/)。



# 06. 二分搜索技巧	

https://labuladong.github.io/algo/2/20/29/





# 07. 滑动窗口技巧	

https://labuladong.github.io/algo/2/20/27/





# 08. 递归反转链表的技巧	

https://labuladong.github.io/algo/2/19/19/



