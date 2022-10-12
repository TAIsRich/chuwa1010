**Q2**

git commit

git checkout

git cherry-pick

git revert

git branch

git rebase

git merge

git clone

git fetch

git pull

git push

**Q3**

enter the work directory: cd /d xxx

and initialize git: git init

**Q4**

git clone url

**Q5**

git branch C1

git checkout C1

**Q6**

git checkout master

git merge branch_test

**Q7**

git stash 

git checkout branch_learn_stash

git stash pop

Intellij: git -> create stash ->stash changes-> checkout the branch -> checkout branch_learn_stash -> pop stash

**Q8**

All changes made by PR is saved on selected branch.

Without branch, PR will effect the base branch directly which may cause errors. The base branch should only contain reviewed correct changes.

**Q9**

Roles:manage dependencies, build project, documentation, reporting, others

It is used since it could be easier to add and remove dependencies/libraries.

**Q10**

clean: clean the project and remove all previous files

prepare-resources: copy resources customized

validate: validate project is correct and information is available

compile: source code compilation

test: test source code is suitable for testing framework

package: creates the JAR/WAR package

install: install the package in local/remote maven repository

deploy: copy the final package to the remote repository

**Q11**

Package creates JAR/WAR package with compiled code.

Install installs the package in local or remote repository.


**Q12**

Plugins are various real action which is performed for maven. Maven consists of collections of plugins. Plugins could be used tocreate jar files, create war files, compile code, unit test code, create project documentation

E: clean, compiler, surefire, jar, war, antrun.....
