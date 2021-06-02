# Spring Snippets: Validating Nested Objects
## A small app demonstrating the usage of custom converters to validate the nested object id and return errors in the form view.

### Problem description ###
When updating an object containing a nested child object (of custom-defined type), Spring's default converter  was 
not raising an error if the id of the child object was wrong. It simply returned null. As the child object was 
a nullable field, no constraint was being violated, so this behavior ended up not giving any errors in the binding 
result.

### App description ###
This small app contains two classes, a Pet and an Owner. The Pet class has an optional Owner.
A custom converter has been defined, converting from String to Owner, by looking in the repository for the string 
value (which is the owner id). If it cannot be found, it raises an exception. Subsequently, this has the effect that 
the conversion cannot be completed, and the failed result is added as an error in the binding result of the controller.
To demonstrate this, run the app and go to the editPet url. If the pet is updated with an owner id of "2", the 
update succeeds. If you enter a number > 2 then the update fails, and the form is returned to the user with the id 
input highlighted.