import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-route-example',
  templateUrl: './route-example.component.html',
  styleUrls: ['./route-example.component.css']
})
export class RouteExampleComponent {
  public tech: any;

  constructor(route: ActivatedRoute) {
    this.tech = route.data.map(data => data.technology);
  }
}
