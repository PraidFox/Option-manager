import React, {Component} from "react";
import ReactDOM from "react-dom";
import Select from "./App/Select";
import Form from "./App/Form";


function run () {
    ReactDOM.render(<div><p>Текст для проверки...</p> <Select/>
        <hr/>
        <hr/>
        <hr/>
        <hr/>
        <Form/>
    </div>, document.getElementById("container"))
}

const loadedStates = ['complete', 'loaded', 'interactive']

if(loadedStates.includes(document.readyState) && document.body){
    run()
} else {
    window.addEventListener('DOMContentLoaded', run, false)
}


// export default class TutorialTimePicker extends Component {
//     render() {
//         return(
//             <div>
//                 <h1>ЕЩЕ ДРУГОЙ ТЕКСТ 123 цйуйцу</h1>
//             </div>
//         )
//     }
// }
//
// AJS.toInit(function () {
//     ReactDOM.render(<TutorialTimePicker/>, document.getElementById("container"))
//     });