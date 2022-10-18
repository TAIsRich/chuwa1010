#### 2.practice git using the platform. List the git commands you learned

git commit   

> 提交指令

git branch   

> 创建分支

 git checkout -b bugFix.  

> 创建分支并且转移到分支上

git merge bugFix  

> 在某个分支上merge进bugFix，尾缀为融合者，所处位置为被融合者

git rebase main

> 在某个分支上rebase， 和merge不同在于rebase所处位置为被融合者，main为接受者

#### 3.What is the basic steps to init a git repo in you local ?

git init

#### 4.  How to clone a repo from Github

git clone URL

#### 5.  How to create a new branch and checkout to that bran

git checkout -b bugFix

#### 6.  How to merge the branch_test to master branch in command ? show me the comma

git checkout master branch

git merge branch_test

#### 7.How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way

git slash

git pop

#### 8 How do you understand PR is based on Branch?

because each branch might means a new modification of the file and code, so each PR based on Branch

#### 9 What is maven role ? what it be used to do 

Maven frame architcture, which helps developers to manages builds, dependencies, version and documentation. Can be added to any java project 

#### 10 What is the lifecycle of maven? could you tell me the detail

prepare resources Resource copying can be customized in this pha

validate      *validate the project is correct and all necessary information is available*

compile     *compile the source code of the project*

test            *test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed*

package      *take the compiled code and package it in its distributable format, such as a JAR.*

install          *install the package into the local repository, for use as a dependency in other projects locally*

deploy         *done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.*

clear 			clear everything before the next project start

#### 11.  what is the difference between package and install in maven lifecycle ?

package will compile the source and package those codes in its distributable formats,such as JAR or WAR. Install will also install the package into the local repository, for use as a dependency in other projects locally.

#### 12.What is plugins in maven, list some plugin

Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. They do this by executing an "action" (i.e. creating a WAR file or compiling unit tests) in the context of a project's description - the Project Object Model (POM).

#### 

