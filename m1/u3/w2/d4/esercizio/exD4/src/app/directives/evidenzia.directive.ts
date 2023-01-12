import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appEvidenzia]'
})
export class EvidenziaDirective {

  constructor(private el:ElementRef, private render:Renderer2) {
    render.setStyle(el.nativeElement,"backgroundColor","pink")
  }
}
