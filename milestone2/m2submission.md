
<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Nicholas Malefyt (nrm6)</td></tr>
<tr><td> <em>Generated: </em> 12/14/2023 12:07:29 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone-2/grade/nrm6" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T16.52.19Screenshot%20(58).png.webp?alt=media&token=b2563db5-7548-47a4-9275-9c61280e3f4c"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload Code. Evaluates whether the user is sending a message,  command, or<br>number.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T16.56.18Screenshot%20(59).png.webp?alt=media&token=6cc8ccbc-6ea4-40b6-ba03-4f39c215b98f"/></td></tr>
<tr><td> <em>Caption:</em> <p>flip and roll commands<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>/flip is a random number generator. if the random is zero it returns<br>heads where a one returns tails./roll takes input and rolls dice and adds<br>them together and returns it to the room using a slightly more advanced<br>number generator that runs x times with y numbers for the format roll<br>XdY.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T17.01.13Screenshot%20(61).png.webp?alt=media&token=a3e0d34e-4400-4034-a991-e7fc8d3d8728"/></td></tr>
<tr><td> <em>Caption:</em> <p>Bold<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T17.02.02Screenshot%20(62).png.webp?alt=media&token=48e620fe-cc69-4da3-9517-c4a521979cac"/></td></tr>
<tr><td> <em>Caption:</em> <p>italics<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-12-14T17.03.09Screenshot%20(63).png.webp?alt=media&token=444c91f1-f919-4f79-bf3f-897b424c44dc"/></td></tr>
<tr><td> <em>Caption:</em> <p>color<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>Bold, Italics and underlind are all based on how markdown works. If a<br>message is contained in between two identifiers of the same type than the<br>styling is applied to them. For example, two asterisks * around the message<br>hello would apply an italic effect on the message. For color, the user<br>can send any color in between pound signs to apply specific coloring to<br>a message.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/nrm6/nrm6-it114-003/pull/6">https://github.com/nrm6/nrm6-it114-003/pull/6</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone-2/grade/nrm6" target="_blank">Grading</a></td></tr></table>
