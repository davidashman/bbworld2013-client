package blackboard.bbworld2013.client;

import org.springframework.stereotype.Component;

import blackboard.bbworld2013.api.Geekifier;
import blackboard.platform.spring.beans.annotations.Extension;

@Component
@Extension( "blackboard.bbworld2013.api.geekifier" )
public class DnDGeekifier implements Geekifier
{

  public static final String DND_FORMAT = "My level 12 Paladin said \"%s\".";

  @Override
  public String toGeekPhrase( String normalPhrase )
  {
    return String.format( DND_FORMAT, normalPhrase );
  }

}
