# HW1

1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

2. practice git using the platform. list the git commands you learned

- git commit
- git branch & git checkout
- git merge
- git rebase
- git cherry-pick

3. What is the basic steps to init a git repo in you local ?

Create a project and go into the new directory.

Type `git init` to initialize the repo. Write some code, type `git add` to add the files, then type `git commit`.

4. How to clone a repo from Github ?

Clone the repository using HTTPS:

```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY
```

To clone the repository using an SSH key need to include a SSH certificate.

5. How to create a new branch and checkout to that branch ?

```bash
git branch <branch_name>
git checkout <branch_name>
```

6. How to merge the branch_test to master branch in command ? show me the commands

```bash
git checkout master
git merge branch_test
```

7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to branch_learn_stash ? try commands way and intellij way.

```bash
git stash
git checkout branch_learn_stash
git stash pop
```

8. How do you understand PR is based on Branch?

Pull requests propose and collaborate on changes to the repository. These changes are proposed in branches to ensure that the default branch contains only completed and approved work.

9. What is maven role ? what it be used to do ?

Maven's purpose is to provide developers with a comprehensive, maintainable, reusable, and simple model for projects.

Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files. The tool helps get the right JAR files for each project as there may be different versions of separate packages.

10. What is the lifecycle of maven? could you tell me the details ?
<!--  -->
1. Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
2. Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
3. Test: It runs unit tests for the project.
4. Package: This step packages the compiled code in distributable format like JAR or WAR.
5. Integration test: It runs the integration tests for the project.
6. Verify: This step runs checks to verify that the project is valid and meets the quality standards.
7. Install: This step installs the packaged code to the local Maven repository.
8. Deploy: It copies the packaged code to the remote repository for sharing it with other developers.

<!--  -->

11. what is the difference between package and install in maven lifecycle ?

`package` will compile your code and also package it. It will create a jar when packaging it and put it somewhere in the target directory.

`install` will compile and package, but it will also put the package in local repository. This will make it so other projects can refer to it and grab it from local repository.

12. What is plugins in maven, list some plugins

Plugins are used to: create jar files, create war files, compile code, unit test code, create project documentation, and on and on. 

Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.

Plugins:
- clean
- compiler
- jar
- javadoc
- antrun