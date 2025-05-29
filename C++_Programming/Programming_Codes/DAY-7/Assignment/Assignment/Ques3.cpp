//3)Create a base class Cricket.Define virtual function “void play()” in it.
//Define following sub classes for this class.A) FiftyOver  b) Test  c) TwentyOver
//“Test” class will have one more function “daywise_summary()”.create a global function “void doit() which accepts 
//reference of type Cricket so that it can invoke “play()” function polymorphically.Inside this function find out 
//where exactly where “Test” is stored using  RTTI(dynamic_cast), and invoke “daywise_summary()” 
//function along with “play()” function.[handle bad_cast exception]

