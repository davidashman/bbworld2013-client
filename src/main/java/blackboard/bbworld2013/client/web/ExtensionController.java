package blackboard.bbworld2013.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import blackboard.bbworld2013.api.GeekService;
import blackboard.platform.spring.beans.annotations.ExtensionRef;

@Controller
public class ExtensionController
{

  @Autowired
  @ExtensionRef( "blackboard.bbworld2013.api.geekService" )
  private GeekService _service;
  
  @RequestMapping( "/geek" )
  public ModelAndView get( @RequestParam( value = "p", defaultValue = "Hello World!" ) String phrase )
  {
    return new ModelAndView( "geek", "phrases", _service.getGeekPhrases( phrase ) );
  }

}
