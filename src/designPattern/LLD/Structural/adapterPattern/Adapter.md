<strong>Adapter Pattern:</strong>
<p>
The Adapter Pattern bridges two incompatible interfaces, allowing them to work together. 
It acts as a middleman, translating one interface into another. 
</p>
<strong>Example:</strong>
<p>
Consider a legacy logging system that uses a method <code>logMessage(String msg)</code>, 
but your application expects a method <code>log(String msg)</code>. 
Using an adapter, you can adapt the legacy logger to match the new interface without modifying the legacy code.
</p>
<strong> Current Examples</strong>

<p>
Consider a payment gateway system where your application uses a modern interface 
with a method like <code>processPayment(amount)</code>, but a third-party payment API 
only supports <code>makeTransaction(total)</code>. 
Using an adapter, you can wrap the third-party API and adapt it to the interface your application expects, 
making integration easier without modifying the third-party code.
</p>


<strong>2nd Example:</strong>
<p>
Imagine a media player application that supports only MP3 files but needs to play other formats like MP4 or Itune. 
Using an adapter, you can wrap the unsupported media format and adapt it to the MP3 player interface, 
allowing the media player to play all file types without changing its core implementation.
</p>