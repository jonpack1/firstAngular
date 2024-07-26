// src/app/app.component.ts

import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';  // Import HttpClientModule
import { RouterModule, Routes } from '@angular/router';  // Import RouterModule and Routes

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true,  // Marking this component as standalone
  imports: [HttpClientModule, RouterModule]  // Import necessary modules here
})
export class AppComponent {
  title = 'my-angular-app';  // Your app title or any initial setup
}


