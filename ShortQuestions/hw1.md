# HW 1
1. All the usage of MarkDown in README.md:
   - \#
   - \## 
   - \###
   - \** 
   - \```
2. The commands learned from https://learngitbranching.js.org/ :
   - git commit
   - git branch
   - git checkout
   - git merge
   - git rebase
   - git checkout branch_name^
   - git checkout branch_name~
   - git branch -f branch_name branch_node
   - git reset
   - git revert
   - git cheery-pick
   - git rebase -i 
   - git tag
   - git describe
3. steps to init a git repo in local:
   1. cd to the directory
   2. git init
4. steps to clone a repo from GitHub:
   1. cd to the directory
   2. git clone [repo website]
5. steps to create a new branch and checkout to that branch:
   1. git branch new_branch
   2. git checkout new_branch
6. steps to merge branch_test to master:
   1. git checkout master
   2. git merge branch_test
7. steps to stash new code before leaving the branch branch_learn_stash and pop the stash when come back:
   1. git stash
   2. git checkout new_branch
   3. git checkout branch_learn_stash
   4. git stash pop
8. Push Request mean tell others about changes you've pushed to a branch in a repository. 
9. maven is a build automation tool. We can use it to build and view the project information, like log document, dependency list, unit test reports etc. Also, we can use it to build project without doing any scripting.
10. For maven base project, the process for building and distributing a particular artifact (project) is clearly defined. The general path: clean -> prepare_resources -> validate -> package -> install.
11. Package is take the compiled code and package it in its distributable format, such as a JAR, and install is install the package into the local repository, for use as a dependency in other projects locally.
12. Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. Some plugins in Maven: clean, compiler, deploy, failsafe, install, resources.
13. 