class Demo {
    message: string;

    constructor(message : string) {
        this.message = message;
    }

    public hello() {
        console.log(this.message);
    }
}

const demo = new Demo('Hello World');
demo.hello();