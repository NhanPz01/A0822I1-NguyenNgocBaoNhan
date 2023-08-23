import React, { Component } from 'react';

class TodoList extends Component {

    constructor() {
        super();
        this.state = {
            list: [],
            item: ''
        }
    }

    handleChange = (event) => {
        const { value } = event.target;
        this.setState({
            item: value
        })
    }
    handleAddItem = () => {
        const item = this.state.item
        console.log(item)
        this.setState({
            list: [...this.state.list, item],
            item: ''
        })
    }
    render() {
        return (
            <div className="todo-list">
                <div className="title">
                    <h1>Todo list</h1>
                </div>
                <div className="body">
                    <input value={this.state.item} onChange={this.handleChange} placeholder='Note here...' />
                    <button onClick={this.handleAddItem}>Add</button>
                </div>
                <div className='todos'>
                    {
                        this.state.list.map((value, index) => (
                            <p key={index}>
                                {value}
                            </p>
                        ))
                    }
                </div>
            </div>);
    }
}

export default TodoList;