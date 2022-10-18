####Question 2: Practice git using the platform. list the git commands you learned https://learngitbranching.js.org/
1. git commit  -> commit the change to the repo
2. git checkout -> switch to the new branch before committing our changes
3. git checkout -b -> create a new branch and switch to the new branch
4. git merge -> merging in git creates a special commit that has two unique parents
5. git rebase -> combine two branches


####Question 3: What is the basic steps to init a git repo in you local ?
1. git init -> init a git repo
2. git add . -> add changes
3. git commit -> commit change to the repo

####Question 4: How to clone a repo from Github ?
1. Go to git repo, and get the ssh link
2. Open terminal and cd to local folder
3. Git clone with ssh link

####Question 5: How to create a new branch and checkout to that branch ?
Solution 1:
git checkout -b <branch name> -> create a new branch and checkout to that branch

Solution 2:
1. git branch <branch name> -> create a new branch
2. git checkout <branch name> -> checkout to that new branch

####Question 6: How to merge the branch_test to master branch in command ? show me the commands
1. git checkout master
2. git rebase branch_test

####Question 7: How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
1. git stash -> stash code before leaving branch branch_learn_stash
2. git stash pop -> pop your stash when you checkout back to **branch_learn_stash

####Question 8: How do you understand PR is based on Branch?
PR is Pull Request, and we can compare the changes between two branches, then we can merge both branch
1. First need to open pull request
2. Need to figure out the base and compare branch
3. Add title and write detail of pull request
4. Create pull request
5. Once the pull request is approved, we can merge pull request

####Question 9: What is maven role ? what it be used to do ?
Maven is powerful project management tool thatis based on project object model. It is used to manage dependencies (package), build projects(Cycle), Documentations, reporting.

####Question 10: What is the lifecycle of maven? could you tell me the details ?
1. mvnClean -> prepare-resources -> validate -> package -> install
2. Details:
   1. Prepare-resource -> resource copying can be customized in this phase. 
   2. Validate -> validate the information -> validates if the project is correct and if all necessary information is available 
   3. Compile -> compilation -> source code compilation is done in this phase 
   4. Test -> testing -> test the compiled source code suitable for test framework 
   5. Package -> packaging -> this phrase creates the JAR/WAR package as mentioned in the packaging in POM.xml 
   6. Install -> installation -> this phase installs the package in local/remote maven repository 
   7. Deploy -> deploying -> copies the final packages to the remote repository 


####Question 11: what is the difference between package and install in maven lifecycle ?
1. Package: creates JAR/WAR packages in POM.xml
2. Install: install package in local/remote maven repository 

####Question 12: What is plugins in maven, list some plugins.
1. Plugins are the central feature of maven, it allows for the reuse of common build logic across multiple projects.
2. Some plugins: clean, compiler, deploy, failsafe, install 





	

