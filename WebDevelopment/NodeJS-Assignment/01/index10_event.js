// In continuation of the 8th question, let's now explore the concept of the maximum number of listeners allowed for event handlers1 For this coding challenge, your task is to determine the current maximum number of event listeners associated with an event and then set the maximum number of event listeners to 51 Note that the default maximum number of listeners might vary1 Your task is to limit the number of listeners to 5.

const EventEmitter = require('events');
let eventEmitter = new EventEmitter(); 


eventEmitter.on('subscribe',(msg)=>{
    console.log(`Thanks for subscribing ${msg}`); // Thanks for subscribing College Wallah
});

eventEmitter.emit("subscribe","College Wallah")

console.log(`Default max listener for eventEmitter "subscribe" is eventEmitter ${eventEmitter.getMaxListeners()}`); // Default max listener for eventEmitter "subscribe" is eventEmitter 10  

eventEmitter.setMaxListeners(5);

console.log(`Default max listener for eventEmitter "subscribe" is eventEmitter ${eventEmitter.getMaxListeners()}`); // Default max listener for eventEmitter "subscribe" is eventEmitter 5