So I took the simplest triangle possible, the one with 2 rows, for example

     7
    3 5
    
and I considered that the base algorithm would be `Min(left, right) + upper`. 

Moving this idea to a bigger triangle was simple. A 3 rows triangle could be transformed as a new 2 rows triangle.
The bottom row would be deleted and the new bottom row would be the sum of the previous expression. On that way, 
we just have to apply the expression again to get the shorter path.

After that, I realized that I was forgetting the elements of the shorter path. I was just getting the sum of the elements 
of the shorter path...

Finally, instead of applying the above idea directly, I was creating a new row but with arrays of ints instead of just ints.
With this idea, I was able to apply my algorithm and also retrieve the complete path of elements that I have chose.  