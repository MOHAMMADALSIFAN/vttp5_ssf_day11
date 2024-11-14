Git commands
In project root folder

git init
Add files to staging
2. git add *

Commit files to local repo
3. git commit -m “initial commit”

Change branch name
4. git branch -m main

Link up remote repo to local repo
5. git remote add origin

Push code up from local repo to remote repo
6. git push -u origin main

Maven Compiler comand
In project root folder
./mvnw clean
mvnw.cmd clean

package the compiled bytecode classes into jar/war file
./mvnw package
mvnw.cmd package

delete target, redownload dependencies, recompile to class files, package to jar/war
./mvnw clean package
mvnw.cmd clean package

run the application in embedded localhost server
./mvnw spring-boot:run mvnw.cmd spring-boot:run