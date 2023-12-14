<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Nicholas Malefyt (nrm6)</td></tr>
<tr><td> <em>Generated: </em> 12/14/2023 3:02:59 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone4/grade/nrm6" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.39.04Screenshot%20(65).png.webp?alt=media&token=c05581b3-c922-4931-a3fb-063ddf2e5bf7"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for the input button<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.43.45Screenshot%20(66).png.webp?alt=media&token=6e8f74f5-ac5d-4602-9bf2-61948c1d613a"/></td></tr>
<tr><td> <em>Caption:</em> <p>Sample output of a chat showing that some of the styling has been<br>applied.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>The server is able to read client side information from previous chats.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.47.49Screenshot%20(67).png.webp?alt=media&token=24f2656a-407f-4d9d-acea-da079ea3d4a7"/></td></tr>
<tr><td> <em>Caption:</em> <p>Nick&#39;s mute list<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.49.53Screenshot%20(68).png.webp?alt=media&token=8d858b53-44fb-4101-ba43-68e0487b7d38"/></td></tr>
<tr><td> <em>Caption:</em> <p>Reads from the file the mute list<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>On startup, the mute list is read from a file with the user&#39;s<br>name. It checks for a name by looking for any new lines in<br>the plaintext file, and marks those names as blocked/muted.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.58.27Screenshot%20(69).png.webp?alt=media&token=a42e8275-83ed-45e2-aec0-0de022a66218"/></td></tr>
<tr><td> <em>Caption:</em> <p>Chat history shows a user has muted you<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T19.59.47Screenshot%20(70).png.webp?alt=media&token=f8c7b86a-e878-48a5-86a0-4ab391758da9"/></td></tr>
<tr><td> <em>Caption:</em> <p>Sample muted/unmuted messages user receives<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Muting/ unmuting is done with the /mute and /unmute command, and takes the<br>user&#39;s names. It then checks if the user is on the mute list,<br>and if so, sends them a mute message telling them it has been<br>applied. The same will happen if the user decides to unmute the other<br>clients.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T20.02.24Screenshot%20(71).png.webp?alt=media&token=ff34840c-f799-451c-9f93-3e50e1a7fe70"/></td></tr>
<tr><td> <em>Caption:</em> <p>User Nick&#39;s mutelist<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone4/grade/nrm6" target="_blank">Grading</a></td></tr></table>
