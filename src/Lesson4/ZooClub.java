package Lesson4;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ZooClub {
    private Map <Person, List <Pet>> club;
}
