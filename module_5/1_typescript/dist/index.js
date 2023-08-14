"use strict";
class Demo {
    constructor(message) {
        this.message = message;
    }
    hello() {
        console.log(this.message);
    }
}
const demo = new Demo('Hello World');
demo.hello();
