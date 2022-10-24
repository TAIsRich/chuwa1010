## hw1

1. Learn **MarkDown** and show all of basic usage in the **ShortQuestions/README.md**

   [basic writing and formatting syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

2. Practice git using the platform. list the git commands you learned

   [learn git branching](https://learngitbranching.js.org/)

3. What is the basic steps to init a git repo in your local?

   ```
   cd your_work_dir
   git init
   ```

4. How to clone a repo from Github?

   ```
   git clone <repo_url>
   ```

5. How to create a new branch and checkout to that branch?

   ```
   git branch new_branch
   git checkout new_branch
   // or can do
   git checkout -b new_branch
   ```

6. How to merge the branch_test to master branch in command? Show me the commands.

   ```
   git checkout master
   git merge branch_test
   git branch -d branch_test
   ```

7. How to **stash** your new code before leaving branch **branch_learn_stach** and pop your stach when you checkout back to **branch_learn_stach**? Try commands way and IntelliJ way.

   ```
   git stash
   
   git stash pop // throws away the stash after applying it
   git stash apply // leaves the stash in the stash list, and use command 'git stash drop' to remove it
   // 'git stash pop' == 'git stash apply' && 'git stash drop'
   ```

8. How do you understand **PR is based on branch**?

   To protect the master branch, changes are often made on the developer's own branch. Then the local changes would be pushed to the remote branch and the pull request is made. This is when the maintainer of the repo or other develpers would review the changes and make comments or request any edit if needed. Then the changes can be merged if approved.

9. What is **maven** role? What is it used to do?

   - Manage dependencies
   - Build projects
   - Documentation
   - Reporting

10. What is the **lifecycle** of maven?

    mvn clean -> prepare resources -> validate -> package -> install

11. What is the difference between **package** and **install** in maven lifecycle?

    The 'mvn package' will compile the source and will package it in its distributable formats, such as a JAR or WAR. The 'mvn install' command, additionally to compiling the source code and packaging it into a WAR or JAR, it will also install the package into the local repository, for use as a dependency in other projects locally.

12. What is **plugins** in maven? List some plugins.

    Maven is actually a plugin execution framework where every task is actully done by plugins. Maven plugins are generally used to create jar files, create war files, compile code, unit test code, create project documentation and so on.

    - clean

    - compiler
    - surefire
    - jar

13. In **chuwa1010, MavenProject** directory, create a **maven Module** using IntelliJ, name it as below:

    - groupID: com.chuwa.learn

    - artifactID: java-core

14. Do **Code Review**: go over the PRs in your repo, try to leave some useful comments in other students' PR, please **don't** merge it.