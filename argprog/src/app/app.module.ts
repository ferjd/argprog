import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './comp/header/header.component';
import { AplogoComponent } from './comp/aplogo/aplogo.component';
import { SocialComponent } from './comp/social/social.component';
import { BannerComponent } from './comp/banner/banner.component';
import { AcercaDeComponent } from './comp/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './comp/experiencia/experiencia.component';
import { EducacionComponent } from './comp/educacion/educacion.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AplogoComponent,
    SocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
