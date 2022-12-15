# ValidParentheses
Dacoda's Notes:
To collect data we will utilize the Stack. LIFO.
We will only collect the open brackets/parentheses.
Make a stack of characters.
Make a variable to track the characters you are traversing through, the input of parentheses.
Write if statement to compare if the character is an open bracket. 
If it is push it onto the stack.
If it is a closing bracket, check stack for matching opening bracket, the
pop off to make a match.
If stack is empty return false.
Write an else if for each of three possible bracket types.
After pushing, peeking and popping, if the stack is empty, return true.
If not false.