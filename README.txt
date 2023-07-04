Karate Chop Kata

Q: As you’re coding each algorithm, keep a note of the kinds of error you encounter. A binary search is a ripe breeding ground for “off by one” and fencepost errors. As you progress through the week, see if the frequency of these errors decreases (that is, do you learn from experience in one technique when it comes to coding with a different technique?).

A: Well a lot of the issues I had were where we were off by a set value in certain conditions like search is in lower or search is in upper.  It would work for one of the cases but not for the other and then I had to focus on fixing that particular piece of the algorithm.  I did see these errors decrease the more I did.

Q: What can you say about the relative merits of the various techniques you’ve chosen? Which is the most likely to make it in to production code? Which was the most fun to write? Which was the hardest to get working? And for all these questions, ask yourself “why?”.

A: Well recursive seems to perform better than non-recursive and recursive where we pass subarrays seem to perform the best.  Ironically the answer to all the questions regarding production code / fun to write / hardest to get working is the sub array implementation.  It seemed to perform the best and it required the most thinking.  I had to introduce an offset for the upper array because we were resetting lower and upper to 0 and the new size.

Q: It’s fairly hard to come up with five unique approaches to a binary chop. How did you go about coming up with approaches four and five? What techniques did you use to fire those “off the wall” neurons?
A: Well I followed the prompts from this exercise (Conventional, Recursive, Functional Sub Array and then I had to do some research into alternative calculations and that is when I found the algorithm that uses Math.ceiling.  I could then adapt that algorithm both recursive and non-recursively