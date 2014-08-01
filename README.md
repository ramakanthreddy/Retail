Retail
======

This is a sample application for retail shop,It may not suitable for all products but I can be extended as and when required.

Steps to deploy application into tomcat through eclipse.

Step 1:

Create manager role in tomcat-user.xml file as below:
<role rolename="manager"/>
<role rolename="admin"/>
<role rolename="manager-script"/>
  <role rolename="manager-gui"/>
  <user username="tomcat" password="tomcat" roles="manager,admin,manager-script,manager-gui"/>

Step 2:

add the following tags under <servers> in settings.xml file

path to settings.xml file:

c:/users/username/.m2/settings.xml

	<server>
	<id>TomcatServer</id>
	<username>tomcat</username>
	<password>tomcat</password>
        </server>
        
        Commands:
        tomcat:deploy
        tomcat:redeploy
