// Its useful to know how to print the conntents of variable to standar output. You can do this 
// with string templates. You can use tamplate expressions to access data stored in variables
// and other objects, and convert them into strings. A string value is a sequence ogf characters in 
// double quotes "". Templates expressions always start with a dollar sign $.

// To evaluate a piece of code in a template expression, place the code within curly braces {}
// after the dollar sign $.

// For example:
    val customers = 10 
    print ("Ther are $customers customers")
//THere are 10 customers

    println("There are ${customers + 1}")
//There are 11 customers 

//You will notice thar there arent any types declared for varibales. Kotlin has inferred the type 
//itself: Int.