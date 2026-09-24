# HW-3
**Name:** Vadym Tutetskyi  
**Programming Language:** Java   
**IDE:** IntelliJ IDEA  

**Since my previous HW was a bit messy I decided to separate Queue and Stack into their own classes, also made them both generic instead of just accepting int.**
(Also in this read me I want to use all these headings, bold text etc. features to make it more readable)  

# Questions Section

### Question 1 What does ADT stand for? 
#### ADT stands for abstract data type  
### Question 2 In your own words, what is an Abstract Data Type?    
#### an abstract data type is a set of rules which is put on top of concrete data type to achieve certain behaviour  
### Question 3 What is the difference between an ADT and its implementation? 
#### ADT is just a set of rules, lets take a stack for example, we might implement it via array, arrayList, linked list etc.
#### some of these data types/structures might be better choice but overall the rules (or requirements) are met while it's implementation may differ
### Question 4 Can two programmers create different implementations of the same ADT? 
#### As was said previously if we use different data types/structures to implement an ADT then its implementation will be different
### Question 5 If one programmer creates a Stack using an array and another creates a Stack using a linked list, are both still Stacks?
#### Yes they are both stacks, that's the purpose of ADT, as long as it has all functionality of stack it will be considered as a stack no matter is it a linked list or array list
### Question 6 What does LIFO mean? 
#### LIFO stands for last in first out
### Question 7 Why did 55 get removed before 15? 
#### Because in a stack the element which is being removed first is the most top one, so the last which was put in, thus we removed 55 because it is the first(on top) item in the stack
### Question 8 If the Stack contains:
 
- A

- B

- C

- D  
**and D was added last, which item should pop() remove first?**  
#### D will be removed first since it will be on top of the stack
### Question 9 Give one real-world or software example where a Stack could be useful. 
#### Stack may be useful for browser back history, when you open new pages the "stack" is being created, each new page goes on top of the stack and when you want to go to the previous page stack will pop the most recent page and return it to you, in addition to that popped page should not vanish but has to be stored in another stack that will allow to go forward or return to the page from which you went back.
### Question 10 What does FIFO mean?
#### FIFO stands for First in First out
### Question 11 Why was 15 removed before 55?
#### since the ADT rules of a queue is FIFO we remove the first element of a so-called line of items, while in stack we thought of it as a pile of items where the first one was buried by dozens of those who came later, in a queue the first one is the one that will be removed first.
### Question 12 If customers enter a line in this order:

- Alex

- Maria

- John

- Sarah  

#### who should leave the Queue first? 
#### We should remove Alexa since she is the first in line.
### Question 13 Give one real-world or software example where a Queue could be useful.
#### For queue anything that depends on the order in which it was received, for example if we have a customer service system lets say general Q&A will work 
#### as a queue, most recent question will be handed to the available representative, however we also should have priority queue Q&A system where the reason for the email might make it receive answer faster but this is other ADT so not to bother now (but for the customer service I think we should have both implemented)
## Part 15 — Stack vs Queue
### Scenario 1 — Undo Feature A text editor remembers your recent actions.

#### If you type:

- A

- B

- C  
**the most recent action should be undone first.**  

**Stack or Queue?**  
#### For this scenario I would choose a stack because we need a history that builds on user input, the older the input it the farther from the scope of return it should be stored. In Queue, we would return the first word/char we entered but this is not what we need, so the stack is most optimal way to implement this undo feature.
### Scenario 2 - Three students send documents to a printer.
#### In this scenario we what the first sender of request to receive the document first so the queue is the best choice there
**(also we can add a $5 feature that will put a student into priority queue, and he or she would receive their document first no matter what )**
### Browser Back Button
#### You visit:

- Google

- YouTube

- GitHub

- Amazon  

**You click the Back button.**  
### Which page should appear first?
#### so if we look at this as an order from top to bottom (so amazon was the last visited page) then go back button should bring me to the gitHub page
### What ADT does this resemble?
#### this resembles a stack ADT
### Scenario 4 — Customer Service Customers are waiting to talk to an employee.
#### The person who arrived first should normally be helped first.

**Stack or Queue?**
#### This is the most common representation of a queue, and also I like the usage of "normally" because there can be circumstances where someone will receive help even though he was not first in a queue
### Scenario 5 — Plates You place five plates on top of one another. Which ADT does this represent?
#### This is a stack of items, just another way to visualize the stack ADT.
## Part 16 — Predict the Output
```` Stack 
Start with an empty Stack.

push(7)

push(12)

push(18)

pop()

push(22)

peek() 
````
### Question 14 What does pop() return?
#### pop() will return 18
### Question 15 What does the final peek() return?
#### peek() will return 22
````
Queue
Start with an empty Queue.

enqueue(7)

enqueue(12)

enqueue(18)

dequeue()

enqueue(22)

peek()
````
### Question 16 What does dequeue() return ?
#### dequeue() should return 7 
### Question 17 What does final peek() return ?
#### final peek() should return 12 
| Feature | Stack      | Queue       |
|---|------------|-------------|
| Rule | LIFO       | FIFO        |
| Add operation | push()     | enqueue()   |
| Remove operation | pop()      | dequeue()   |
| View next item | peek()     | peek()      |
| First item removed | last added | first added |
 












