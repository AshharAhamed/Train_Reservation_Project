'use strict'

import React, {Component} from 'react';
import SearchTrain from "../Train/SearchTrain";


export default class AppContainer extends Component {
    constructor(props){
        super(props);

    }



    render(){
        return <div>
            <SearchTrain/>
        </div>
    }
}