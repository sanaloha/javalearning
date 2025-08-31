#Use Case of Map Function:
The map operation transforms each element of a stream into another form. It applies a function to every element and returns a new stream containing the results of that transformation.

#Examples:
**Squaring numbers in a list.
**Make the String UpperCase or LowerCase.
**Map each word to its length
**


#Reduct:
Reduce provides a single result out from the analysis of elements of a collection.

Identity

This is the initial value for the reduce function and if the stream is empty then this is the default value of the reduce operation.

Accumulator

This function aggregates the data based on the business logic written in the function. It has two inputs, one is the partial result of the reduce operation and another is the next element in the array.

Combiner

This comes into play when you have parallel streams to be processed by the reduce function or the arguments for reduce function are not same as that of the output of reduce function.