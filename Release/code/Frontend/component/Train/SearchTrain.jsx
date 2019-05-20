'use strict';

import React, {Component} from 'react';
import PropTypes from 'prop-types';

export default class SearchTrain extends Component{
    static get propTypes(){
        return{
            searchTrain:PropTypes.func
        };
    }

    constructor(props){
        super(props);

    }

    onNameChange(event){
        event.preventDefault();
        event.stopPropagation();
        this.name = event.target.value;
    }

    onSubmit(event){
        event.preventDefault();
        event.stopPropagation();
        this.name = '';
    }

    render(){
        return <div>
            <form >
                <input type="text" onChange={event => this.onNameChange(event)}/>
                <button type="submit">Search</button>
            </form>
        </div>
    }

}