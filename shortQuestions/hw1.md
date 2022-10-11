# Answers for HM1
3. What is the basic steps to init a git repo in you local? 
   Step1 : Go into the new directory.  2. Type git init.
   
4. How to clone a repo from Github ?
    git clone "the url of the Github repo"
  
5. How to create a new branch and checkout to that branch ?
    git checkout b -branch name
  
6. How to merge the branch_test to master branch in command?
    git checkout branch_test
    git pull origin master
    git merge test
    git push origin master
    
7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
  checkout back to **branch_learn_stash ? try commands way and intellij way.
    git stash save "changes on branch_learn_stash"
    git checkout another_branch
    git checkout branch_learn_stash 
    git stash pop


8. How do you understand PR is based on Branch?
   We tend to merge our own branches into the master/main branch or the parent branch, for the purpose of documenting all modifications and keeping good practise of version control.
   so PR is based on Branch. If no branch, no PR.

9. What is maven role ? what it be used to do ?
   Maven is for managing Dependencies(Package), building projects, documentation, reporting and others.

10. What is the lifecycle of maven? 
    mvn Clean -> prepare-resources -> validate -> package -> install.

    Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a stage in the lifecycle.
    For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):
    validate - validate the project is correct and all necessary information is available
    compile - compile the source code of the project
    test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
    package - take the compiled code and package it in its distributable format, such as a JAR.
    verify - run any checks on results of integration tests to ensure quality criteria are met
    install - install the package into the local repository, for use as a dependency in other projects locally
    deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.


11. What is the difference between package and install in maven lifecycle? 

    Package means take the compiled code and package it in its distributable format, such as a JAR.
    Install means install the package into the local repository, for use as a dependency in other projects locally.

12. What is plugins in maven, list some plugins.
    Maven has 2 types of plugins, one is for build and one is for reporting. They can automate and perform all the build and reporting tasks in a Java project. Here is an example for plugin in the build section to add the capability to compile our project into a jar:
    <build>
    ....
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.2.0</version>
            ....
        </plugin>
    ....
    </plugins>
    </build>
        Another example: One of the simplest plugins in Maven is the Clean Plugin. The Maven Clean plugin (maven-clean-plugin) is responsible for removing the target directory of a Maven project. When you run "mvn clean", Maven executes the "clean" goal as defined in the Clean plug-in, and the target directory is removed. The Clean plugin defines a parameter which can be used to customize plugin behavior, this parameter is called outputDirectory and it defaults to ${project.build.directory}.

13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:*

    *1. groupID: com.chuwa.learn*

    *2. artifactID: java-core*

    