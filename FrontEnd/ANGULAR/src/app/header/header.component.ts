import {Component} from '@angular/core';

@Component({
    selector: 'app-header',
    template: `
    <h1>Header Component</h1>
    ` ,
    styles:[
        `h1{
            background: black;
            color: white;
            padding: 20px;
        }`
    ]
})

export class HeaderComponent {

}