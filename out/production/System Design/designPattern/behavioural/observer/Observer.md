<h3>Key Components of the Observer Pattern</h3>

<ol>
    <li>
        <strong>Subject</strong>:
        <ul>
            <li>Maintains a list of observers and provides methods to attach, detach, and notify them.</li>
        </ul>
    </li>
    <li>
        <strong>Observer</strong>:
        <ul>
            <li>Defines an interface for objects that should be notified of changes.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete Subject</strong>:
        <ul>
            <li>Implements the subject and maintains its state.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete Observer</strong>:
        <ul>
            <li>Implements the observer interface and updates its state based on notifications.</li>
        </ul>
    </li>
</ol>


<h3>Explanation of the Code</h3>
<ol>
    <li>
        <strong>Observer Interface</strong>:
        <ul>
            <li>The <code>Observer</code> interface ensures all observers implement the <code>update</code> method.</li>
        </ul>
    </li>
    <li>
        <strong>Subject Interface</strong>:
        <ul>
            <li>The <code>Subject</code> interface defines methods to manage and notify observers.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete Subject</strong>:
        <ul>
            <li><code>WeatherStation</code> maintains its state (<code>temperature</code>) and notifies observers when it changes.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete Observers</strong>:
        <ul>
            <li><code>PhoneDisplay</code> and <code>WebDisplay</code> implement the <code>Observer</code> interface and react to state changes.</li>
        </ul>
    </li>
    <li>
        <strong>Client Code</strong>:
        <ul>
            <li>Demonstrates attaching and detaching observers and triggering notifications.</li>
        </ul>
    </li>
</ol>
