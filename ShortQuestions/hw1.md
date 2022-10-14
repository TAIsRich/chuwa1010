Hw1 Xinyu Zhang
#### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

#### 2. practice git using the platform.list the git commands you learned
```
git commit
git checkout
git checkout -b [yourbranchname]
git switch
git rebase
git merge
```
   
#### 3. What is the basic steps to init a git repo in you local?
```
1. create a directory to contain the project
2. go into the new directory
3. type git init
```
#### 4. How to clone a repo from Github?
    cd your_work_dir
    git clone github_url

#### 5. How to create a new branch and check out to that branch?

    git branch branch_name
    git checkout branch_name
------
    git checkout -b branch_name

#### 6. How to merge the branch_test to master branch in command? Show me the commands.
    git checkout branch_test
    git merge branch_test

#### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? Try commands way and IntelliJ way.

    commands way:
        git stash
        git stash pop


    IntelliJ way:
        in the left side click commit and then right click your new code and choose "Shelve Changes"
        pop: right click new file and choose "Unshelve"


#### 8. How do you understand PR is based on Branch?
```
we make a new branch based on master branch and do some changes
after done, we make PR to try to merge that branch in.
and the contributor can review your work.
```



#### 9. What is maven role? What it be used to do?
```
Maven is a popular open-source build tool to build, publish, and deploy several projects at once.
It is used for projects build, dependency and documentation.
```

#### 10. What is the lifecycle of maven? Could you tell me the details?

`Validate`: This step validates if the project structure is correct.

`Compile`:  It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.

`Test`: It runs unit tests for the project.

`Package`: This step packages the compiled code in distributable format like JAR or WAR.

`Integration Test`: It runs the integration tests for the project.

`Verify`: This step runs checks to verify that the project is valid and meets the quality standards.

`Install`: This step installs the packaged code to the local Maven repository.

`Deploy`: It copies the packaged code to the remote repository for sharing it with other developers.


#### 11. What is the difference between package and install in maven lifecycle?
```
package and install are both compile your code and package it, 
but install will put your package in your local repository
```
#### 12. What is plugins in maven. List some plugins.
```
Plugin in maven is the one of the vital feature that is basically used to reuse the common build logic across different projects. 

List some plugins: clean, compiler, deploy, failsafe, install, resources ...

```