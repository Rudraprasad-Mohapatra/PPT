// While working with the events module, one interesting observation is that when an event is created and called, the associated event handler is triggered. However, what happens if we remove an event and then try to call it? In this coding challenge letes create an event handler and call it, Later let's remove the event handler and observe what happens when we call it.

const EventEmitter = require('events');

const eventEmitter = new EventEmitter();

const subscribeMessage = (channelName)=>{
    console.log(`Thanks for Subscribing to ${channelName}.`);
}

eventEmitter.addListener("subscribe",subscribeMessage);
console.log("calling event listener before removing the event.")
eventEmitter.emit("subscribe","College Wallah");
console.log("calling event listener after removing the event.")
eventEmitter.removeListener("subscribe",subscribeMessage);

eventEmitter.emit('subscribe',"College Wallah");