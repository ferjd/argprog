import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './comp/header/header.component';
import { AplogoComponent } from './comp/aplogo/aplogo.component';
import { SocialComponent } from './comp/social/social.component';
import { BannerComponent } from './comp/banner/banner.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AplogoComponent,
    SocialComponent,
    BannerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
