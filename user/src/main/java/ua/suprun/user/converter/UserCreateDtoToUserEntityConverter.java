package ua.suprun.user.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ua.suprun.user.dto.UserCreateDto;
import ua.suprun.user.entity.UserEntity;

/**
 * Class UserEntityToUserDtoConverter implementation.
 *
 * @author Bohdan_Suprun
 */
@Component
public class UserCreateDtoToUserEntityConverter implements Converter<UserCreateDto, UserEntity>
{
    @Override
    public UserEntity convert(UserCreateDto userCreateDto)
    {
        final UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userCreateDto.getEmail());
        userEntity.setFirstName(userCreateDto.getFirstName());
        userEntity.setLastName(userCreateDto.getLastName());
        userEntity.setId(null);

        return userEntity;
    }
}
