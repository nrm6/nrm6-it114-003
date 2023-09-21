<table><tr><td> <em>Assignment: </em> IT114 M2 Java-HW</td></tr>
<tr><td> <em>Student: </em> Nicholas Malefyt (nrm6)</td></tr>
<tr><td> <em>Generated: </em> 9/20/2023 11:39:05 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-m2-java-hw/grade/nrm6" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p><br></p><p><strong>Template Files</strong>&nbsp;You can find all 3 template files in this gist:&nbsp;<a href="https://gist.github.com/MattToegel/fdd2b37fa79a06ace9dd259ac82728b6">https://gist.github.com/MattToegel/fdd2b37fa79a06ace9dd259ac82728b6</a>&nbsp;<br></p><p>Setup steps:</p><ol><li><code>git checkout main</code></li><li><code>git pull origin main</code></li><li><code>git checkout -b M2-Java-HW</code></li></ol><p>You'll have 3 problems to save for this assignment.</p><p>Each problem you're given a template&nbsp;<strong>Do not edit anything in the template except where the comments tell you to</strong>.</p><p>The templates are done in such a way to make it easier to capture the output in a screenshot.</p><p>You'll copy each template into their own separate .java files, immediately git add, git commit these files (you can do it together) so we can capture the difference/changes between the templates and your additions. This part is required for full credit.</p><p>HW steps:</p><ol><li>Open VS Code at the root of your repository folder</li><li>In VS Code create a new folder/directory called M2</li><li>Create 3 new files in this new M2 folder (Problem1.java, Problem2.java, Problem3.java)</li><li>Paste each template into their respective files</li><li><code>git add .</code></li><li><code>git commit -m "adding template baselines</code></li><li>Do the related work (you may do steps 8 and 9 as often as needed or you can do it all at once at the end)</li><li><code>git add .</code></li><li><code>git commit -m "completed hw"</code></li><li>When you're done push the branch<ol><li><code>git push origin M2-Java-HW</code></li></ol></li><li>Create the Pull Request with <b>main</b>&nbsp;as base and&nbsp;<strong>M2-Java-HW</strong>&nbsp;as compare (don't merge/close it yet)</li><li>Create a new file in the M2 folder in VS Code called m2_submission.md</li><li>Fill out the below deliverable items, save the submission, and copy to markdown</li><li>Paste the markdown into the m2_submission.md</li><li>add/commit/push the md file<ol><li><code>git add m2_submission.md</code></li><li><code>git commit -m "adding submission file"</code></li><li><code>git push origin M2-Java-HW</code></li></ol></li><li>Merge the pull request from step 11</li><li>On your local machine sync the changes<ol><li><code>git checkout main</code></li><li><code>git pull origin main</code></li></ol></li><li>Submit the link to the m2_submission.md file from the main branch to Canvas</li></ol><p><br></p></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Problem 1 - Only output Odd values of the Array under "Odds output" </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 1 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T02.14.55M2P1.png.webp?alt=media&token=e0242423-2e59-434e-a816-81434d7f8150"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code explaining how I calculated the odds<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T02.15.11M2P1output.png.webp?alt=media&token=9f15dc1e-b294-4d77-a426-86578daceb34"/></td></tr>
<tr><td> <em>Caption:</em> <p>Odd numbers being output<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>I was able to do this using Java&#39;s modulus operator. Modulus checks the<br>remainder of division, and I checked for a remainder of 1 when dividing<br>by two(meaning the number is odd. Because of that, I would then output<br>the odd number while skipping the evens.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Problem 2 - Only output the sum/total of the array values (the number must end in 2 decimal places, if it ends in 1 it must have a 0 at the end) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 2 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T02.42.40M2P2.png.webp?alt=media&token=877df81a-5546-4b15-9e6f-c2a8a6612210"/></td></tr>
<tr><td> <em>Caption:</em> <p>code for problem 2<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T02.40.12M2P2output.png.webp?alt=media&token=34378d6c-64e6-418a-8610-f69258e0b515"/></td></tr>
<tr><td> <em>Caption:</em> <p>output rounded to 2 decimal places<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>I did the totaling by adding up each individual array double into a<br>running total. I then was able to round the output using String format<br>which allowed me to finally get the extra zero in.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Problem 3 - Output the given values as positive under the "Positive Output" message (the data otherwise shouldn't change) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 3 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T03.21.10M2P3.png.webp?alt=media&token=d27f67be-bd08-48c6-832b-ef1338924c6b"/></td></tr>
<tr><td> <em>Caption:</em> <p>Some of the code I was able to complete.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fnrm6%2F2023-09-21T03.21.02M2P3output.png.webp?alt=media&token=753a0ffb-fb5c-434d-895c-15f09931681c"/></td></tr>
<tr><td> <em>Caption:</em> <p>Attempt at output. First case would output but second would not<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>Positive conversion is done by checking if a value is less than zero.<br>if that is true, then the value is negative and multiplied by -1<br>to make it positive. In order to cast, I checked the input type<br>and then modified each value after first figuring out it it was an<br>int, double or string.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc Items </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull Request URL for M2-Java-HW to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/nrm6/nrm6-it114-003/pull/2">https://github.com/nrm6/nrm6-it114-003/pull/2</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about what you learned, any issues you had, how you resolve them</td></tr>
<tr><td> <em>Response:</em> <p>I learned more about casting and the various types of loops in java.<br>I also learned more about the many features such as the square root,<br>absolute value and more while trying to figure out ways to convert the<br>value to positive.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-m2-java-hw/grade/nrm6" target="_blank">Grading</a></td></tr></table>