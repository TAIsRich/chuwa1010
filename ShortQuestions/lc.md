**1.	双指针技巧for LinkedList**

题型：合并、分解链表，寻找链表倒数节点或中点，判断是否有环并找出环起点，判断是否相交并找出交点


a)	21: Merge Two Sorted Lists

设dummy为虚拟头结点(ListNode(-1))，p = dummy。 在l1和l2不为null的前提下，while 循环每次比较 p1 和 p2 的大小，把较小的节点接到结果链表p上, 更新l1/l2 = l1/l2.next。 更新p = p.next

当parameter l1, l2 为null的状况，直接将不为空的另一个列表接到结果链表上。 最终返回dummy.next。


```Java
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode p = dummy;
    
    while(l1 != null && l2 != null){
        //assign smaller value to p
        if(l1.val > l2.val){
            p.next = l2;
            l2 = l2.next;
        } else{
            p.next = l1;
            l1 = l1.next;
        }
        p = p.next;
    }
    
    if(l1 != null){
        p.next = l1;
    }
     if(l2 != null){
        p.next = l2;
    }
    
    return dummy.next;
}	
	```


b)	86: Partition List（分离链表）:以值x为界限，分离出大于x和小于x的两条链表，之后再合并。

设两个虚拟头结点dummya, dummyb，p1,p2与其相等，p与parameter head相等。在p不为null的前提下，while循环，比较p与parameter x的大小，大于等于则接到p2链表，小于则给p1, 更新p1/p2 = p1/p2.next。 用temp交换p与p.next，断开原链表中的每个节点的 next 指针。

进行p1和dummyb的合并，返回dummya.next

```Java
  public ListNode partition(ListNode head, int x) {
        ListNode dummya = new ListNode(-1);
        ListNode dummyb = new ListNode(-1);
        ListNode p1 = dummya, p2 = dummyb;
        ListNode p = head;
        
        while(p != null){
            if(p.val >= x){
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }
            //break the pointer of original list to next
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        
        //merge
        p1.next = dummyb.next;
        return dummya.next;
        
    }
```
	
c)	23: Merge k Sorted Lists

与21类似，难点在于找出k个LinkedList的最小节点作为结果的开始节点 -> 使用PriorityQueue并以升序排列。

首先排除parameter lists为null的情况。 其次设dummy为虚拟头结点，p = dummy。 新建PriorityQueue pq，将lists中不为null的节点加入并使用升序排列。

以pq不为空的前提下开始while循环，使用pq.poll()找出最小节点node，接到p链表上。只要下一个node不为空，加入pq中。 更新p为p.next。

最后返回dummy.next。

时间复杂度为O(Nlogk)，N为节点总数，k为链表条数。 poll: O(logk)

```Java
public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        
       //priority queue in ascending order
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));
        //add each list's head to priority queue 
        for(ListNode head: lists){
            if(head != null){
                pq.add(head);
            }
        }
        
        while(!pq.isEmpty()){
            //minimum value
            ListNode i = pq.poll();
            p.next = i;
            if(i.next != null){
                pq.add(i.next);
            }
            p = p.next;
        }
        
        return dummy.next;
    }
```

d)	19: Remove Nth Node From End of List 移除倒数第N个节点

假设链表有L个节点，倒数第n个节点就是正数第(L-n + 1)个节点。

设一个虚拟头结点dummy，使用双指针p1，p2。 p1 = head,先走n+1步。然后，在p1不为null的前提下，再让p2与p1同时走(L-n)步，使p2指向倒数第n+1个节点。 

找到倒数第N+1个节点，替代倒数第N个节点为N+2。返回dummy.next。

```Java
 public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
        
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 0; i <= n; i++) {
        first = first.next;
    }
        
    // Move first to the end, maintaining the gap
    // second gets nth node from end of list
    while (first != null) {
        first = first.next;
        second = second.next;
    }
        
    second.next = second.next.next;
    return dummy.next;
}
```


e)	876: Middle of the Linked List

与19相似，也需使用快慢指针。 初始化指针指向head，以快指针及fast.next不为null为条件，开始while循环。 快指针走两步，慢指针走一步。 最终返回慢指针。

```Java
public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        //fast reverse till the end while slow reverse till the half
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
```


f)	141,142: Linked List Cycle（是否有环，找出环的起点）

使用快慢指针，如果fast最终遇到空指针，说明链表中没有环；如果fast最终和slow相等，那肯定是fast超过了slow一圈，说明链表中含有环。

当快慢指针相遇时，让其中任一个指针指向头节点，然后让它俩以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。

```Java
 public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //slow at k, fast at 2k
                //has cycle
                break; // meet
            }
        }
            if(fast == null || fast.next == null){
                return null;
            }
            // slow at 0
            slow = head;
            while(slow != fast){
                // assume distance of pos from head is m
                // fast from pos is k-m
                // slow from pos is k-m
                fast = fast.next;
                slow = slow.next;
            }
        return slow;
        }
    
```


g)	160: Intersection of Two Linked Lists

p1指向headA便利A，p2指向headB遍历B。让p1遍历完链表A之后开始遍历链表B，让p2遍历完链表B之后开始遍历链表A，让p1和p2同时进入公共部分，也就是同时到达相交节点c1。

```Java
 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        
        while(p1 != p2){
            if(p1 == null){
                p1 = headB;
            } else{
                //iterate A
                p1 = p1.next;
            }
            if(p2 == null){
                p2 = headA;
            } else{
                //iterate B
                p2 = p2.next;
            }
        }
        // when p1 iterates the element equals p2
        // return it
        return p1;
    }
```



**02 数组双指针解题技巧**

题型：原地修改(快慢指针)：去重，移动    

滑动窗口左右指针： sum from sorted Array, 反转字符串，回文

a)	26: Remove Duplicates from Sorted Array

快慢指针技巧，要求原地修改。 while循环条件为fast值 < nums的长度

慢指针走在后面，快指针走在前面探路，找到一个不重复的元素就赋值给 slow 并让 slow 前进一步。 这样，就保证了 nums[0..slow] 都是无重复的元素，当 fast 指针遍历完整个数组 nums 后，nums[0..slow] 就是整个数组去重之后的结果。

返回[0..slow]的数组长度，即slow+1

```Java
 public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
}
```

b)	83: Remove Duplicates from Sorted List

与26类似，指针类型从int变ListNode。 当slow和fast值相等，意味着该linkedlist遍历结束，fast变为null，因此slow.next赋值为null。

```Java
  public ListNode deleteDuplicates(ListNode head) {
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
        slow.next = null;
        return head;
    }
```


c)	27: Remove Element

与26相似，删除指定值val，原地修改nums，返回去除val以后的元素的个数。

区别在于 nums[slow] = nums[fast]和 slow++顺序的调换，[0..slow-1]为剩余元素存储的数组，因此个数为slow

```Java
 public int removeElement(int[] nums, int val) {
        
        int fast = 0, slow = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
            	//mind the order change, [0..slow-1]
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
```

d)	283: Move Zeroes

原地修改，将数组中的所有值为 0 的元素移到数组末尾。 等同于27中parameter val = 0。

可以套用27的模板，但是要记得给p及之后的元素赋值为0。

```Java
    public void moveZeroes(int[] nums) {
        //remove elements = 0
        int p = removeElement(nums, 0);
        //assign nums[p...] with 0
        for(int i = p; i < nums.length; i++){
            nums[i] = 0;
        }
    }
    
    
     public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
```

e)	167: Two Sum II - Input Array Is Sorted

数组有序，用左右指针分别取值，找出相加为target的两个index并作为int[]返回。 

左右指针相加得出sum，比较sum和target，从而得到调整方向 -> left增加，得到更大的sum。right减小，得到更小的sum。

```Java
public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            
            if(sum == target){
                return new int[]{left + 1, right + 1};
            } else if (sum < target){
                //larger sum;
                left++;
            } else if (sum > target){
                // smaller sum
                right--;
            }
            
        }
        return new int[]{-1, -1};
    }
```


f)	344: Reverse String

原地反转字符串，使用tmp交换左右指针的char来达到反转的目的。 

```Java
 public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            //swap s[left] and s[right]
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
```

g)	5: Longest Palindromic Substring(最长回文串)

palindrome method返回以 s[l] 和 s[r] 为中心的最长回文串，判断回文串的中心在哪里(中心为单数或偶数)。

回文子串问题是让左右指针从中心向两端扩展。

```Java
public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            // 以 s[i] 为中心的最长回文子串
            String s1 = palindrome(s, i, i);
            // 以 s[i], s[i+1] 为中心的最长回文子串
            String s2 = palindrome(s, i, i + 1);
            
            //make sure the longest length;
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }
    
    public String palindrome(String s, int l, int r) {
    while (l >= 0 && r < s.length()
            && s.charAt(l) == s.charAt(r)) {
        l--; 
        r++;
    }
    
    return s.substring(l + 1, r);
    }
```





**03 前缀和数组技巧**

前提：原始数组不会被修改的情况下，频繁查询某个区间的累加和

a)	303: Range Sum Query - Immutable

构造前缀和数组(比原数组长一个单位，求nums[i] = preSum[i+1] - preSum[i])，其中preSum[i]记录nums[0..i-1]的累加和，=preSum[i-1]+nums[i-1]。调用指定区间的和，最坏时间复杂度为常数 O(1)。 

```Java
private int[] preSum;

    public NumArray(int[] nums) {
        //store the sum for [0, i-1]
        preSum = new int[nums.length + 1];
        for(int i = 1; i < preSum.length; i++){
            preSum[i] = nums[i - 1] + preSum[i - 1];
        } 
    }
    
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
```


b)	304: Range Sum Query 2D - Immutable

构建一个二维 preSum 数组，专门记录以原点为顶点的矩阵的元素之和，就可以用几次加减运算算出任何一个子矩阵的元素和。

```Java
 private int[][] preSum;
    
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) {
             return;
         }
        preSum = new int[m+1][n+1];
        for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= n; j++){
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] + matrix[i-1][j-1] - preSum[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preSum[row2+1][col2+1] - preSum[row1][col2+1] - preSum[row2+1][col1]+ preSum[row1][col1];
    }
```

**04 差分数组技巧**

情况： 频繁对原始数组的某个区间的元素进行增减。

diff与原数组长度相等。 diff[i] 就是 nums[i] 和 nums[i-1] 之差。修改 diff，然后通过 diff 数组反推，即可得到 nums 修改后的结果。


```Java
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

a)	370: Range Addition

```Java
int[] getModifiedArray(int length, int[][] updates) {
    int[] nums = new int[length];
    Difference df = new Difference(nums);
    
    for (int[] update : updates) {
        //[i, j]区间
        int i = update[0];
        int j = update[1];
        //增值
        int val = update[2];
        df.increment(i, j, val);
    }
    
    return df.result();
}
```

b)	1109:  Corporate Flight Bookings

叙述进行了变化，但是本质还是区间的加减。需注意题目给的区间匹配array的index时要-1.

```Java
 public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        Difference df = new Difference(nums);

        for (int[] booking : bookings) {
            //index for array should -1
            int i = booking[0] - 1;
            int j = booking[1] - 1;
            int val = booking[2];
            df.increment(i, j, val);
        }
        return df.result();
    }
```


c)	1094: Car Pooling

查分数组长度根据题意规定，题意车站个数0 ~ 1000, 数组为了涵盖范围，设为1001.

```Java
public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001];
        Difference df = new Difference(nums);
        
        for(int[] trip: trips){
            int val = trip[0];
            //在车上的区间[trip[1], trip[2] - 1]
            int i = trip[1];
            int j = trip[2] - 1;
            df.increment(i, j, val);
        }
        
        int[] res = df.result();
        
        //ensure not overload
        for (int i = 0; i < res.length; i++) {
            if (capacity < res[i]) {
                return false;
            }
        }
        return true;
    }
```

**05 二维数组花式遍历技巧**

a)	48: Rotate Image

将一个二维矩阵顺时针旋转 90 度，难点在于要原地修改。

思路：先将 n x n 矩阵 matrix 按照左上到右下的对角线进行镜像对称，然后再对矩阵的每一行进行反转。

逆时针旋转90度的区别在于按照从左下到右上对角线镜像对称，因此代码中为swap(matrix[i][j], matrix[n-j-1][n-i-1])
```Java
public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n ; i++){
            for(int j = i; j < n ; j++){
                //swap matrix[i][j] and [j][i] 即镜像对称
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //反转每一行
        for(int[] row: matrix){
            reverse(row);
        }
    }
    
    public void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
```

b)	151: Reverse Words in a String

思路1：先倒转整个字符串，然后分别反转每个单词。 难点在于倒转时还需要处理原始字符串包含的空格问题。

思路2：先去掉string里的所有空格，以List形式收录字符串，然后使用Collections.reverse倒转这个list。 最后加入适当的空格。

```Java
public String reverseWords(String s) {
        s = s.trim();
        
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
```


c)	54: Spiral Matrix

顺时针螺旋顺序返回数组中的所有元素。 按照右、下、左、上的顺序遍历数组，并使用四个变量圈定未遍历元素的边界

```Java
 public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        //make sure the boudaries
        int up = 0;
        int left = 0;
        int right = cols - 1;
        int down = rows - 1;

        while (result.size() < rows * cols) {
            // to right
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            
            // to down and start from the next row
            for (int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            
            // right to left on a different row
            if (up != down) {
                for (int col = right - 1; col >= left; col--) {
                    result.add(matrix[down][col]);
                }
            }
            
            // on a different column, from down to up
            if (left != right) {
                for (int row = down - 1; row > up; row--) {
                    result.add(matrix[row][left]);
                }
            }
            
            //update the boudaries
            left++;
            right--;
            up++;
            down--;
        }

        return result;
    }
```


d)	59: Spiral Matrix II

按照螺旋的顺序生成正方形n x n的矩阵。思路类似54。

```Java
 public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        //make sure the boudaries
        int up = 0;
        int left = 0;
        int right = n - 1;
        int down = n - 1;
        int num = 1;

        while (num <= n * n) {
            // to right
            if(up <= down){
                 for (int col = left; col <= right; col++) {
                    matrix[up][col] = num++;
                }
                up++;
            }
            
            // to down and start from the next row
             if(left <= right){
                for (int row = up ; row <= down; row++) {
                    matrix[row][right] = num++;
                }
                 right--;
             }
            
            // right to left on a different row
            if (up <= down) {
                for (int col = right; col >= left; col--) {
                    matrix[down][col] = num++;
                }
                down--;
            }
            
            // on a different column, from down to up
            if (left <= right) {
                for (int row = down; row >= up; row--) {
                    matrix[row][left] = num++;
                }
                left++;
            }
           
        }

        return matrix;
    }
```

**06 二分搜索技巧**

题型：寻找一个数、寻找左侧边界（最早出现的地方）、寻找右侧边界（最晚出现的地方）。

计算 mid 时需要防止溢出，代码中 left + (right - left) / 2 就和 (left + right) / 2 的结果相同，但是有效防止了 left 和 right 太大，直接相加导致溢出的情况。

a)	704:  Binary Search

```Java
 public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;//最后一个元素
       
        while(left <= right){// [left, right]因为前面right赋值是最后一个元素，终止条件为搜索区间是 [right + 1, right]，区间为空
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;//[mid+1, right]
            } else if(nums[mid] > target){
                right = mid - 1; //[left, mid-1]
            }
        }
        return -1;
    }
```


b)	34:  Find First and Last Position of Element in Sorted Array

既要左边界又要右边界，同时要确保左<=右。

```Java
 public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return new int[]{-1, -1};
        }
        
        int leftIndex = findLeftIndex(nums, target);
        int rightIndex = findRightIndex(nums, target);
        
        if(leftIndex > rightIndex){
            return new int[]{-1, -1};
        }
        return new int[]{leftIndex, rightIndex};
    }
    
    public int findLeftIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length;//赋值变化对应 left < right的循环条件
        while(left < right){// 终止的条件是 left == right，此时搜索区间 [left, left) 为空，所以可以正确终止。
            int mid = left + (right - left) / 2;
            
            //[left, right) 
            if(nums[mid] == target){
                right = mid;//缩小「搜索区间」的上界 right，在区间 [left, mid) 中继续搜索，即不断向左收缩，达到锁定左侧边界的目的
            } else if(nums[mid] < target){
                left = mid + 1; //[mid + 1, right)。
            } else if(nums[mid] > target){
                right = mid;//[left, mid)
            }
        
        }
        return left;//返回值left or right都一样，因为终止条件left = right
    }
    
    public int findRightIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length;//赋值变化对应 left < right的循环条件
        while(left < right){// 终止的条件是 left == right，此时搜索区间 [left, left) 为空，所以可以正确终止。
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target){
                left = mid + 1;//增大「搜索区间」的左边界 left，使得区间不断向右靠拢，达到锁定右侧边界的目的。
            } else if(nums[mid] < target){
                left = mid + 1;//[mid+1, right)
            } else if(nums[mid] > target){
                right = mid;//[left,mid)
            }
        
        }

        // // 判断 target 是否存在于 nums 中
        // // 此时 left - 1 索引越界
        // if (left - 1 < 0) return -1;
        // // 判断一下 nums[left] 是不是 target
        // return nums[left - 1] == target ? (left - 1) : -1;

        return left - 1;//!!!!!!left = mid + 1，因此要-1
    }
```


整体逻辑：

第一个，最基本的二分查找算法：

因为我们初始化 right = nums.length - 1

所以决定了我们的「搜索区间」是 [left, right]

所以决定了 while (left <= right)

同时也决定了 left = mid+1 和 right = mid-1

因为我们只需找到一个 target 的索引即可

所以当 nums[mid] == target 时可以立即返回




第二个，寻找左侧边界的二分查找：

因为我们初始化 right = nums.length

所以决定了我们的「搜索区间」是 [left, right)

所以决定了 while (left < right)

同时也决定了 left = mid + 1 和 right = mid

因为我们需找到 target 的最左侧索引

所以当 nums[mid] == target 时不要立即返回

而要收紧右侧边界以锁定左侧边界



第三个，寻找右侧边界的二分查找：

因为我们初始化 right = nums.length

所以决定了我们的「搜索区间」是 [left, right)

所以决定了 while (left < right)

同时也决定了 left = mid + 1 和 right = mid

因为我们需找到 target 的最右侧索引

所以当 nums[mid] == target 时不要立即返回

而要收紧左侧边界以锁定右侧边界

又因为收紧左侧边界时必须 left = mid + 1

所以最后无论返回 left 还是 right，必须减一！！！






**07 滑动窗口技巧**

题型： 字符串排列，无重复字符的最短字符串，最小子串，字母异位词

逻辑：

```Java
int left = 0, right = 0;

while (right < s.size()) {
    // 增大窗口
    window.add(s[right]);
    right++;
    
    while (window needs shrink) {
        // 缩小窗口
        window.remove(s[left]);
        left++;
    }
}



/* 滑动窗口算法框架 */
void slidingWindow(string s) {
    unordered_map<char, int> window;//HashMap代替
    
    int left = 0, right = 0;
    while (right < s.size()) {
        // c 是将移入窗口的字符
        char c = s[right];
        // 增大窗口
        right++;//map.put(key, map.getOrDefault(key, 0) + 1)
        // 进行窗口内数据的一系列更新
        ...

        /*** debug 输出的位置 ***/
        // 注意在最终的解法代码中不要 print
        // 因为 IO 操作很耗时，可能导致超时
        printf("window: [%d, %d)\n", left, right);
        /********************/
        
        // 判断左侧窗口是否要收缩
        while (window needs shrink) {
            // d 是将移出窗口的字符
            char d = s[left];
            // 缩小窗口
            left++;
            // 进行窗口内数据的一系列更新
            ...
        }
    }
}
```

a)	76:  Minimum Window Substring

S(source) 中找到包含 T(target) 中全部字母的一个子串，且这个子串一定是所有可能子串中最短的。

思路：1、我们在字符串 S 中使用双指针中的左右指针技巧，初始化 left = right = 0，把索引左闭右开区间 [left, right) 称为一个「窗口」。

2、我们先不断地增加 right 指针扩大窗口 [left, right)，直到窗口中的字符串符合要求（包含了 T 中的所有字符）。

3、此时，我们停止增加 right，转而不断增加 left 指针缩小窗口 [left, right)，直到窗口中的字符串不再符合要求（不包含 T 中的所有字符了）。同时，每次增加 left，我们都要更新一轮结果。

4、重复第 2 和第 3 步，直到 right 到达字符串 S 的尽头。

代码中needs 和 window 相当于计数器，分别记录 T 中字符出现次数和「窗口」中的相应字符的出现次数。

```Java
 public String minWindow( String s, String t ) {
        String res = "";
        //排除t > s的情况
        if (t.length() > s.length()) {
            return res;
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt( i );
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int r = 0;
        int valid = 0;

        // 记录最小覆盖子串的起始索引及长度
        int len = Integer.MAX_VALUE;
        int start = 0;

        while (r < s.length()) {
            //ch -> 进入窗口的字符
            char ch = s.charAt(r);
            r++;//扩大窗口

            //进行窗口内数据的一系列更新
            if (need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if (window.get(ch).equals(need.get(ch))) {
                    valid++;
                }
            }
            // 判断左侧窗口是否要收缩
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (r - l < len) {
                    start = l;
                    len = r - l;
                }
                // d 是将移出窗口的字符
                char d = s.charAt( l );
                // 左移窗口
                l++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        // 根据index返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
```

b)	567: Permutation in String

和76相似，给你一个 S 和一个 T，请问你 S 中是否存在一个子串，包含 T 中所有字符且不包含其他字符？

区别： 移动 left 缩小窗口的时机是窗口大小大于 t.size() 时，因为排列嘛，显然长度应该是一样的。

当发现 valid == need.size() 时，就说明窗口中就是一个合法的排列，所以立即返回 true。

```java
 public boolean checkInclusion(String p, String s) {
        // ========= 模板：定义相关数据结构，初始化工作============
        HashMap<Character, Integer> window_map = new HashMap<>();
        HashMap<Character, Integer> p_map = new HashMap<>();
        for (int i = 0; i < p.length(); i++){
            char c1 = p.charAt(i);
            p_map.put(c1, p_map.getOrDefault(c1, 0) + 1);
        }
        int left, right, count;
        left = right = count = 0;

        // ================== 模板：开始滑动窗口=====================
        while (right < s.length()) {

            // =========== 模板：向右滑动窗口，装填满足的字符到map中==========
            char c = s.charAt(right);
            right++;
            if (p_map.containsKey(c)) {
                window_map.put(c, window_map.getOrDefault(c, 0) + 1);
                if (window_map.get(c).equals(p_map.get(c))) {
                    count++;
                }
            }

            // =========== 根据题意：此时“有可能”出现满足条件的解 ==========
            while (right - left == p.length()) {

                // ============= 根据题意：获取“真正”满足条件的解 =============
                if (count == p_map.size()){
                    return true;
                }

                // ========== 模板：左指针向右滑动，寻找下一个可行解/优化已知解======
                char d = s.charAt(left);
                left++;
                if (p_map.containsKey(d)) {
                    if (window_map.get(d).equals(p_map.get(d))) {
                        count--;
                    }
                    window_map.put(d, window_map.getOrDefault(d, 0) - 1);
                } 
            }
        }
        return false;
    }
```

解法2： 分别用HashMap记录s1和s2中与s1长度相同的子串(滑动窗口得到该子串)的ch和出现次数，对比出现的字符是否都存在且在出现次数相等。

```Java
public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        HashMap <Character, Integer> s1map = new HashMap<> ();
        
        //record charcter and corresponding amount
        for (int i = 0; i < s1.length(); i++){
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap <Character, Integer> s2map = new HashMap<> ();
            for (int j = 0; j < s1.length(); j++) {
                s2map.put(s2.charAt(i + j), s2map.getOrDefault(s2.charAt(i + j), 0) + 1);
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }
    
    
    public boolean matches(HashMap <Character, Integer> s1map, HashMap <Character, Integer> s2map) {
        for (char key: s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
```


c)	438:  Find All Anagrams in a String

anagram：字母异位词 E: abc和cba

同上思路，找到一个合法异位词（排列）之后将起始索引加入 res 即可。

```Java
 public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> pCount = new HashMap<>();

        for (int i = 0; i < p.length(); i++){
            char c1 = p.charAt(i);
            pCount.put(c1, pCount.getOrDefault(c1, 0) + 1);
        }

        int left, right, count;
        left = right = count = 0;
        ArrayList<Integer> res = new ArrayList<>();
         
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            
            if (pCount.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(pCount.get(c))) {
                    count++;
                }
            }

            while (right - left == p.length()) {
                if (count == pCount.size()){
                    res.add(left);
                }

                //shrink and update the window
                char d = s.charAt(left);
                left++;
                if (pCount.containsKey(d)) {
                    if (window.get(d).equals(pCount.get(d))) {
                        count--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                } 
            }
        }
        return res;
    }
```

d)	3: Longest Substring Without Repeating Characters

区别：收缩窗口完成后更新 res

```Java
  public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int res = 0;
        
        while(right < s.length()){
            char r = s.charAt(right);
            //count char r
            chars[r]++;
            
            //count > 1, shrink and update
            while(chars[r] > 1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
             res = Math.max(res, right - left + 1);
        
            right++;
        }
        
       return res;
    }
```

**08 递归反转链表的技巧**

a)	206: Reverse Linked List

输入一个单链表头结点，排除null linkedList或者只有1个元素情况后，将该链表反转，返回新的头结点

```Java
public ListNode reverseList(ListNode head) {
        // index from 1
        
        //base case
        //empty linked list or only one element
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode last = reverseList(head.next);
        // swap the null value with head, follow the order after reversing
        head.next.next = head;
        head.next = null;
        
        return last;
        
        
    }
```


b)	92: Reverse Linked List II

给一个索引区间 [m, n]（索引从 1 开始），仅仅反转区间中的链表元素。

基础：反转前 N 个节点。然后使用递归反复调用来直到触发base case.

```Java
 ListNode successor = null;
    

    public ListNode reverseBetween(ListNode head, int left, int right) {
        //basecase
        if (left == 1){
            return reverseN(head, right);
        }
        //递归，前进到反转的起点触发 base case
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }
    
    //反转以 head 为起点的 n 个节点，返回新的头结点
    public ListNode reverseN(ListNode head, int n){
        if (n == 1) {
        successor = head.next;
        return head;
        }

         // 以 head.next 为起点，需要反转前 n - 1 个节点
        ListNode last = reverseN(head.next, n - 1);

         // 让反转之后的 head 节点和后面的节点连起来
        head.next.next = head;
        head.next = successor;
        return last;
    }
```

