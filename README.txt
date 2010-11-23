Requirments :

i) Any operating system ( Linux is preferable )

ii) Java Runtime Environment

ii) Two twitter accounts

Setting up:

Step 1:

Create two twitter accounts one for SERVER and one which acts as CLIENT here :

jGateway account acts as server ( runs on the host machine )  and

karthikselva account acts as client ( RemoteAdmin for the system )

Step 2:

Download my jGateway file from here

always copy execid file along with jGateway.jar

Step 3 :

open a terminal and run the file as  java -jar  jGateway.jar

if you also need to run admin commands run sudo java -jar jGateway

enter the server username and password of twitter account

Start Server

this will listen to incoming commands

Step 4:

now to send a shell command to server from any machine just login into your twitter account

and send a direct message to the server account from your account

Send command from client

note : remember both of the accounts are following each other

Step 5:

After the command has been read by the server it will execute  the command in same java window .

After Execution in server

if the command is valid and has executed succesffully then the server will tweet as <COMMAND_NAME> <SUCCESS>

tweet by server

else the command have failed it will display as <COMMAND_NAME> <FAILED>

Disclaimer :

I have tested my code in Ubuntu 10.04 and its working . If you get any twitterException while running then either your account must be blocked by twitter.com or  Check your internet connection before running.