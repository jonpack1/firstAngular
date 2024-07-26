// src/app/my-new-component/my-new-component.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-my-new-component',
  templateUrl: './my-new-component.component.html',
  styleUrls: ['./my-new-component.component.css']
})
export class MyNewComponentComponent {
  message: string = 'Hello from MyNewComponent!';
}

