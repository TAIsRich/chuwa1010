## HW1 - Git, Maven, PR

1. **Learn MarkDown and show all of basic usage in the ShortQuestions/README.md**

2.  **Practice git using the platform. list the git commands you learned** https://learngitbranching.js.org/
    - ```git revert``` - it is a forward-moving undo operation by creating a new commit that inverses the changes
    - ```git reset``` - it is a undo operation which resets current HEAD to the specified state, should be used on a private branch
    - ```git cherry-pick``` - it picks a commit from one branch and applies it to another
    - ```git rebase``` - it combines a sequence of commits and re-writes the project history by creating brand new commits for each commit in the original branch

3. **What is the basic steps to init a git repo in you local?**
   - Create a new directory and go into this directory
   - Use ```git init ``` to initialize a empty repository
   - Create your project files
   - Use ```git add .``` to add all files, or ```git add <file_name>``` to add a specific file
   - Use ```git commit``` to record changes to the repository

4. **How to clone a repo from GitHub?**
   - At the GitHub repository page, copy its URL
   - Type ```git clone``` and paste that URL   

5. **How to create a new branch and checkout to that branch?**

   ```
   git branch <branch_name> 
   git checkout <branch_name>
   ```

   Or ```git checkout -b <branch_name>```

6. **How to merge the branch_test to master branch in command?**

   ```
   git checkout master
   git merge branch_test
   ```

7. **How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash?**

   ```
   git stash
   git stash pop
   ```

8. **How do you understand PR is based on Branch?**

   Pull Request shows the changes you've pushed to a branch. It shows the changes between the compare branch and the base branch. 

9. **What is maven role ? what it be used to do?**

   Maven is a tool that used for building and managing Java-based project. Maven's roles include managing dependencies, building project, documentation and reporting.

10. **What is the lifecycle of maven? could you tell me the details?**

    The lifecycle is defined by a list of build phases. The default lifecycle comprises of the following phases:

    - ```validate``` - it validates the project and all required information are correct
    - ```compile``` - it compiles the source code, converts the .java files to .class
    - ```test``` - it tests the compiled source code using a suitable unit testing framework
    - ```package``` - it packages the compiled code in distributable format such as JAR
    - ```verify``` - it runs checks on integration tests results to verify the project is valid and meets the quality standards
    - ```install``` - it installs the package into the local repository
    - ```deploy``` - it copies the final package to the remote repository

11. **What is the difference between package and install in maven lifecycle?**

    ```package``` takes the compiled code and package it in its distributable format such as JAR

    ```install``` will install that generated package into the local repository

12. **What is plugins in maven, list some plugins.**

    Maven is a framework for a collection of Maven plugins, which means plugins are where much of the real action is performed. 

    Some common plugins: clean, compiler, surefire, antrun
