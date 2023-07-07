//8.Let's simulate a subscription feature similar to YouTube. Using the events module, we'll create a custom event named "subscribe". When this event is triggered, it should display a message in the console indicating that the user has subscribed.

const EventEmitter = require('events');
let eventEmitter = new EventEmitter(); 


eventEmitter.on('subscribe',(msg)=>{
    console.log(`Thanks for subscribing ${msg}`); // Thanks for subscribing College Wallah
});

eventEmitter.emit("subscribe","College Wallah")

