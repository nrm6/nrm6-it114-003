<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Nicholas Malefyt (nrm6)</td></tr>
<tr><td> <em>Generated: </em> 10/23/2023 7:41:25 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-milestone1/grade/nrm6" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project if one doesn't exist yet</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github (yes it'll be blank for now)</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet, just have it in open status)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Fix the package references at the top of each file (these are the only edits you should do at this point)</li><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><ol><li>Note: The client commands likely are different in part 5 with the /name and /connect options instead of just connect</li></ol><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.16.44Server-Waiting.png.webp?alt=media&token=c3eb528c-c1f1-43e8-a918-f38c325b0724"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server is listening on Port 3000<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.22.32Client-Waiting.png.webp?alt=media&token=499397b1-c6bb-4e4d-9ec9-9c8fe6d4f83d"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client waiting to connect<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.22.54Client%20Connected.png.webp?alt=media&token=b9c3e3bf-8ec2-4ac4-a360-6a52df0e5476"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client named Nick has connected to the Server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>On the server side, it waits for a user to establish the connection<br>with the /connect command after they have already input their name. On the<br>client end, the user must first add their name before a connection can<br>be made. The socket waits until it can receive a username and a<br>port connection before initiating a connection.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.29.06Two%20Clients.png.webp?alt=media&token=ad8e3043-46b5-4738-a55d-6ecfecc14ad0"/></td></tr>
<tr><td> <em>Caption:</em> <p>Multiple users can send information to the server (Nick and Chris) and users<br>can see who sent what messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted (sent to all connected clients), and received</td></tr>
<tr><td> <em>Response:</em> <p>The client can send a message to the server by simply typing a<br>phrase. The message is then read in the individual Thread, which is able<br>to help identify the user sending each message to the server. After that<br>the message gets sent to the room and is then sent for all<br>clients to see.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.34.22Chris%20-%20disconnect.png.webp?alt=media&token=ac50f178-e0a9-49bc-a7f3-0150cd417c5a"/></td></tr>
<tr><td> <em>Caption:</em> <p>User Chris has disconnected from the Server.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-10-23T23.35.56Screenshot%20(47).png.webp?alt=media&token=4a5d85f0-d2ce-4605-b4af-c62120e60c80"/></td></tr>
<tr><td> <em>Caption:</em> <p>User Nick sees Disconnect and also disconnects, and then reconnects<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>The client disconnects from the Server and ends the socket. Because the Server<br>uses threads to allow multiple users, the server is not terminated when one<br>user disconnects and can handle many users connecting and disconnecting to it.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/nrm6/nrm6-it114-003/pull/4">https://github.com/nrm6/nrm6-it114-003/pull/4</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>I did not have any issues with this assignment except the issue I<br>emailed professor Toegel about with Git uploading all my files when I push<br>the branch.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-milestone1/grade/nrm6" target="_blank">Grading</a></td></tr></table>
