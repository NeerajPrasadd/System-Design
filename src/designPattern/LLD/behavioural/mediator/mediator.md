In this design pattern we have

<br> Mediator interface
    register Caller object (user for chat, aircraft to traffic controll)
<br> Mediator concrete
    implementation of above interface
<br> Colleague interface ( this is mostly abstract class)(user,aircraft)
    it has send and receive message
    
<br> concrete Colleague
    implementation of above interface 
    
*Key Components of the Mediator Pattern*
<p>Mediator Interface: Defines the communication methods that the mediator must implement.
<p>Concrete Mediator: Implements the mediator interface and coordinates communication between different objects (colleagues).
<p>Colleague Interface: Defines a common interface for components to communicate via the mediator.
<p>Concrete Colleagues: Implement the colleague interface and rely on the mediator to interact with other colleagues.
<p>When to Use the Mediator Pattern
When multiple objects interact in a complex way, and you want to simplify communication by centralizing it.
To promote loose coupling between components.
When you need to encapsulate the communication logic in one place to make the system easier to maintain and extend.