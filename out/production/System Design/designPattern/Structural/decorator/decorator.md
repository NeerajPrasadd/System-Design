<strong>Decorator Pattern:</strong>
<p>
The Decorator Pattern dynamically adds new functionality or behavior to an object without altering its structure. 
It allows stacking enhancements around an object while keeping the base implementation unchanged.
</p>
<strong>Example:</strong>
<p>
In a logging system, you may start with basic logging functionality that writes logs to a file. 
Using decorators, you can add features like writing logs to the console, sending them to an external monitoring system, 
or applying filters (e.g., only error-level logs). 
Each decorator wraps the base logger, extending its behavior without modifying the original logger class.
</p>

<p>We can have debug log, info log, error log class and we can wrap the log and propagate it to parent class and so on</p>