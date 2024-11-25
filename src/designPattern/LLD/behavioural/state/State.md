<h3>Key Components of the State Pattern</h3>
<ol>
    <li>
        <strong>Context</strong>:
        <ul>
            <li>The main object whose behavior varies based on its current state. It delegates behavior to the current state object.</li>
        </ul>
    </li>
    <li>
        <strong>State Interface</strong>:
        <ul>
            <li>Defines the common behavior that all concrete states must implement.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete States</strong>:
        <ul>
            <li>Implement the behavior associated with a particular state of the Context.</li>
        </ul>
    </li>
</ol>


<h3>Explanation of Code</h3>
<ol>
    <li>
        <strong>State Interface</strong>:
        <ul>
            <li>The <code>TrafficLightState</code> interface ensures that all states implement the <code>handleState</code> method.</li>
        </ul>
    </li>
    <li>
        <strong>Concrete States</strong>:
        <ul>
            <li>The <code>RedLightState</code>, <code>GreenLightState</code>, and <code>YellowLightState</code> define behaviors specific to each state.</li>
        </ul>
    </li>
    <li>
        <strong>Context</strong>:
        <ul>
            <li>The <code>TrafficLight</code> class uses a <code>TrafficLightState</code> object to delegate behavior and allows changing the state dynamically.</li>
        </ul>
    </li>
    <li>
        <strong>Client Code</strong>:
        <ul>
            <li>Demonstrates the ability to transition between states and trigger behavior based on the current state.</li>
        </ul>
    </li>
</ol>
