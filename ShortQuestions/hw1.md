## HW1

1. *Learn MarkDown and show all of basic usage in the **ShortQuestions/README.md***
>   https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

2. *Practice git using the platform. List the git commands you learned*

> https://learngitbranching.js.org/

```git
git commit
git branch 'branchName'
git checkout 'branchName'
git merge
git clone 
git pull
git push
```

3. *What is the basic steps to init a git repo in your local?*

    In your target repository, type `git init `

4. *How to clone a repo from Github?*

    `git clone 'gitRepoSSH' `

5. *How to create a new branch and checkout to that branch?*

    - `git checkout -b 'branchName'`
    - ```git
        git branch 'branchName'
        git checkout 'branchName'
        ```

6. *How to merge the branch_test to master branch in command?show me the commands*

    ```git
    git checkout master
    git merge branch_test
    ```

7. *How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.*

    `git stash push`

8. *How do you understand PR is based on Branch?*

    Pull Request is for team members or individuals to make changes, add features and finally merge to the main branch. It also provides a platform that people can review the codes before merging to the main branch.

9. *What is maven role? what it be used to do?*

    Maven is a tool that is used for building and managing any Java based project. It is a powerful project management tool that is based on POM (Project Object Model). It simplifies the build process.

10. *What is the lifecycle of maven? could you tell me the details ?*

    Maven build life-cycle is made up of below phases,
    - validate: validate the project is correct and all necessary information is available
    - compile: compile the source code of the project
    - test: test the compiled source code using a suitable unit testing framework. These tests should not require the code to be packaged or deployed
    - package: take the compiled code and package it in its distributable format, such as a JAR
    - verify: run any checks on results of integration tests to ensure quality criteria’s are met
    - install: install the package into the local repository, for using as a dependency in other projects locally
    - deploy: done in the build environment, copies the final package to the remote repository for sharing with other developers and projects

11. *What is the difference between package and install in maven lifecycle?*

     - package: take the compiled code and package it in its distributable format, such as a JAR
     - install: install the package into the local repository, for using as a dependency in other projects locally

12. *What is plugins in maven, list some plugins.*
    
    Maven provides a standardized way to maintain each project by proving all the necessary JAR files, and dependencies in its repository and separates one project from another via a unique id.
    > https://maven.apache.org/plugins/

