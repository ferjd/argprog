import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

/* Import ng-circle-progress*/
import { NgCircleProgressModule } from 'ng-circle-progress';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './comp/header/header.component';
import { AplogoComponent } from './comp/aplogo/aplogo.component';
import { BannerComponent } from './comp/banner/banner.component';
import { AcercaDeComponent } from './comp/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './comp/experiencia/experiencia.component';
import { EducacionComponent } from './comp/educacion/educacion.component';
import { HardsoftComponent } from './comp/hardsoft/hardsoft.component';
import { ProyectComponent } from './comp/proyect/proyect.component';
import { FooterComponent } from './comp/footer/footer.component';
import { HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AplogoComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardsoftComponent,
    ProyectComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({
      radius: 100,
      outerStrokeWidth: 16,
      innerStrokeWidth: 8,
      outerStrokeColor: "#78C000",
      innerStrokeColor: "#C7E596",
      animationDuration: 300,
    }),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]  
})
export class AppModule { }
