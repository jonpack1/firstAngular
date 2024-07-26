// src/app/api.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl = 'http://localhost:8080/hello';  // Base URL for your Spring Boot API

  constructor(private http: HttpClient) { }

  // Method to get items from the backend
  getItems(): Observable<any> {
    return this.http.get(`${this.baseUrl}/items`);
  }

  // Method to create a new item
  createItem(id: number, name: string): Observable<any> {
    return this.http.post(`${this.baseUrl}/create`, { id, name });
  }
}

