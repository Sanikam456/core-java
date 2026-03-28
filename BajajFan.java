class BajajFan{
// static variables.
static boolean isSwitch;
static int maxTemperature=5;
static int minTemperature=0;
static int currentTemperature=3;
// static method
public static boolean onOroff() {
System.out.println("onOrOff method started");
if (isSwitch=false) {
isSwitch= true;
System.out.println("Fan is on:"+isSwitch);
}
else if (isSwitch=true) {
isSwitch=false;
System.out.println("Fan is off:"+isSwitch);
}
System.out.println("onOrOff method end");
return isSwitch;
}
}