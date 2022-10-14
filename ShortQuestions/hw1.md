1. In README.md
2. Learned following commands
   - git commit
   - git branch
   - git checkout
   - git merge
   - git rebase
3. Use ```git init``` to initialize the git repo in the directory you plan to create the repo.
4. Use ```git clone <URL>```
5. Use ```git checkout -b <branch>``` or
   ```
   git branch <branch>
   git checkout <branch>
   ```
6. Use
   ```
   git chechout master
   git merge branch_test
   ```
7. ```git stash push``` and ```git stash pop``` in command. And in Intellij there are stash and unstash commands in git menu.
8. Because pull request is all about let people know and work on the difference between your branch and the base branch.
9. Maven is been used to manage the dependencies and build the project.
10. The maven lifecycle including
    1. Prepare resources: copy the resource
    2. Validate: validate if the project is correct and information required is available
    3. Compile: compile the source code
    4. Test: test the compiled code
    5. Package: create the package
    6. Install: install the package in local repository
    7. Deploy: copy the package to the remote repository
11. Package would create the package from compiled code and install would put that package in the local repository
12. Maven is a collection of Maven plugins and all the actions in Maven are performed by plugins, for example clean and compiler.
